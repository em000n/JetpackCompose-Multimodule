package com.emon.profile

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.emon.common.LoadingAnimation
import com.emon.common.theme.JetpackComposeMultimoduleAppTheme
import com.emon.entity.profile.ProfileApiEntity


@Composable
fun ProfileScreen(userName: String, navController: NavController) {
    val viewModel = hiltViewModel<ProfileViewModel>()
    val context = LocalContext.current
     LaunchedEffect(key1 = context) {
           viewModel.action(ProfileViewModel.ProfileUiAction.FetchProfileApi(userName = userName))
       }
    val stateEvent by viewModel.uiState.collectAsState("")

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Profile")
                },
                navigationIcon = if (navController.previousBackStackEntry != null) {
                    {
                        IconButton(onClick = { navController.navigateUp() }) {
                            Icon(
                                imageVector = Icons.Filled.ArrowBack,
                                contentDescription = "Back"
                            )
                        }
                    }
                } else {
                    null
                },

                backgroundColor = Color.Black,
                contentColor = Color.White,
                elevation = 12.dp
            )
        },
        content = { padding ->
            JetpackComposeMultimoduleAppTheme(darkTheme = false) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(padding),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    when (stateEvent) {
                        is ProfileViewModel.ProfileUiState.ProfileApiSuccess -> {
                            val profile =
                                (stateEvent as ProfileViewModel.ProfileUiState.ProfileApiSuccess).data
                            ProfileUI(profile)
                        }

                        is ProfileViewModel.ProfileUiState.ApiError -> {
                            Toast.makeText(
                                context,
                                "" + (stateEvent as ProfileViewModel.ProfileUiState.ApiError).message,
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                        is ProfileViewModel.ProfileUiState.Loading -> {
                            if ((stateEvent as ProfileViewModel.ProfileUiState.Loading).isLoading) LoadingUI()
                        }
                    }
                }
            }
        }
    )


}

@Composable
fun LoadingUI() {
    Box(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentAlignment = Alignment.Center
    ) {
        LoadingAnimation()
    }
}

@Composable
fun ProfileUI(profileApiEntity: ProfileApiEntity) {
    Column(
        Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = rememberAsyncImagePainter(profileApiEntity.avatar_url),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .border(width = 2.dp, color = Color.LightGray, CircleShape)
        )
        Spacer(Modifier.size(5.dp))
        Text(profileApiEntity.name, fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Text(profileApiEntity.login, fontSize = 18.sp)

        Spacer(Modifier.size(10.dp))
        Text(profileApiEntity.bio, fontSize = 18.sp, textAlign = TextAlign.Center)
        Spacer(Modifier.size(10.dp))
        Divider(color = Color.Gray)
        Spacer(Modifier.size(5.dp))

        Row() {
            Column(
                Modifier
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "${profileApiEntity.public_repos}",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Text(
                    text = stringResource(com.emon.assets.R.string.repository),
                    color = Color.Black,
                    fontSize = 16.sp
                )
            }
            Column(
                Modifier
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "${profileApiEntity.followers}",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Text(
                    text = stringResource(com.emon.assets.R.string.follower),
                    color = Color.Black,
                    fontSize = 16.sp
                )
            }
            Column(
                Modifier
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "${profileApiEntity.following}",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Text(
                    text = stringResource(com.emon.assets.R.string.following),
                    color = Color.Black,
                    fontSize = 16.sp
                )

            }
        }

    }


}