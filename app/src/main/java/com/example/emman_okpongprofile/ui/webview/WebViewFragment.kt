package com.example.emman_okpongprofile.ui.webview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.emman_okpongprofile.R


/**
 * THis fragment implement the webview Display of the referenced URl
 * In this case the reference URL is my GitHub Repository
 */
class WebViewFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_web_view, container, false)
        val webView= view.findViewById<WebView>(R.id.webviewid)
        webView.webViewClient= WebViewClient()
        webView.loadUrl(  "https://github.com/emmanuelokpong")
        webView.settings.javaScriptEnabled=true
        webView.settings.setSupportZoom(true)

        return view
    }

}