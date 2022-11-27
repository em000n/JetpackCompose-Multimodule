package com.emon.profile

import com.emon.domain.base.BaseViewModel
import com.emon.domain.base.Result
import com.emon.domain.usecase.ProfileApiUseCase
import com.emon.entity.profile.ProfileApiEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val profileApiUseCase: ProfileApiUseCase
) : BaseViewModel() {

    val action: (ProfileUiAction) -> Unit

    private val _uiState = MutableStateFlow<ProfileUiState<*>>(ProfileUiState.Loading (true))
    val uiState get() = _uiState

    init {
        action = {
            when(it){
                is ProfileUiAction.FetchProfileApi -> fetchProfileApi(it.userName)
            }
        }
      //  fetchProfileApi("em00n")
    }

    private fun fetchProfileApi(userName:String) {
        execute {
            profileApiUseCase.execute(params = userName).collect{ result ->
                when(result) {
                    is Result.Loading ->
                        _uiState.value = ProfileUiState.Loading(result.loading)
                    is Result.Success -> {
                        _uiState.value = ProfileUiState.ProfileApiSuccess(result.data)
                    }
                    is Result.Error ->
                        _uiState.value=ProfileUiState.ApiError(result.message)
                }
            }
        }

    }

    sealed class ProfileUiState<out R>{
        data class Loading(val isLoading:Boolean):ProfileUiState<Loading>()
        data class ProfileApiSuccess(val data: ProfileApiEntity): ProfileUiState<ProfileApiSuccess>()
        data class ApiError(val message:String): ProfileUiState<String>()

    }

    sealed class ProfileUiAction {
        data class FetchProfileApi(val userName:String) : ProfileUiAction()
    }
}

