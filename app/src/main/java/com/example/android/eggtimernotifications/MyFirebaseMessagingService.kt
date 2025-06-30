package com.example.android.eggtimernotifications

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {


    override fun onNewToken(token: String) {

        Log.d("MyFirebaseMessaging", "Refreshed token: $token")

        sendRegistrationToServer(token)
    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)
    }


    private fun sendRegistrationToServer(toke: String?){
        // TODO: implement this method to send token to your app server
    }
}