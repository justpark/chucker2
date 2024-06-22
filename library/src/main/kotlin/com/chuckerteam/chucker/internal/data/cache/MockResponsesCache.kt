package com.chuckerteam.chucker.internal.data.cache

import android.util.LruCache

private const val MOCK_API_CACHE_SIZE: Int = 25

public val mockApiCache: LruCache<String, MockApiPackage> =
    LruCache<String, MockApiPackage>(MOCK_API_CACHE_SIZE)

public data class MockApiPackage(val responseCode: Int, val jsonStringBody: String)
