package com.example.android.codelabs.paging.data

import androidx.paging.PagingSource
import androidx.paging.PagingState

class ArticlePagingSource: PagingSource<Int, Article>() {
    override fun getRefreshKey(state: PagingState<Int, Article>): Int? {
        TODO("Not yet implemented")
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Article> {
        TODO("Not yet implemented")
    }

}