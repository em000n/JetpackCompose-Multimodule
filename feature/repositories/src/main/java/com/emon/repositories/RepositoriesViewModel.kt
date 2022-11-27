package com.emon.repositories

import com.emon.domain.base.BaseViewModel
import com.emon.domain.base.Result
import com.emon.domain.usecase.RepositoriesApiUseCase
import com.emon.entity.repositories.RepositoriesListApiEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class RepositoriesViewModel @Inject constructor(
    private val repositoriesApiUseCase: RepositoriesApiUseCase,
) : BaseViewModel() {

    val action: (RepositoriesListUiAction) -> Unit

    private val _uiState = MutableStateFlow<RepositoriesListUiState<*>>(RepositoriesListUiState.Loading (true))
    val uiState get() = _uiState

    init {
        action = {
            when(it){
                is RepositoriesListUiAction.FetchRepositoryList -> fetchRepoList(it.userName)
            }
        }
        fetchRepoList("em00n")
    }

    private fun fetchRepoList(userName:String) {
        execute {
            repositoriesApiUseCase.execute(params = userName).collect{ result ->
                when(result) {
                    is Result.Loading ->
                        _uiState.value = RepositoriesListUiState.Loading(result.loading)
                    is Result.Success -> {
                        _uiState.value = RepositoriesListUiState.RepositoriesListApiSuccess(result.data)
                    }
                    is Result.Error ->
                        _uiState.value=RepositoriesListUiState.ApiError(result.message)
                }
            }
        }

    }

    sealed class RepositoriesListUiState<out R>{
        data class Loading(val isLoading:Boolean):RepositoriesListUiState<Loading>()
        data class RepositoriesListApiSuccess(val data: RepositoriesListApiEntity): RepositoriesListUiState<RepositoriesListApiSuccess>()
        data class ApiError(val message:String): RepositoriesListUiState<String>()

    }


    sealed class RepositoriesListUiAction {
        data class FetchRepositoryList(val userName:String) : RepositoriesListUiAction()
    }
}

