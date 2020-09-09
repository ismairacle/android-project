package com.ismail.consumerapp.db

import android.net.Uri
import android.provider.BaseColumns

/**
 * Created by dicoding on 10/12/2017.
 */

internal class DatabaseContract {



    internal class NoteColumns : BaseColumns {
        companion object {

            const val TABLE_NAME = "note"
            const val _ID = "_id"
            const val TITLE = "title"
            const val DESCRIPTION = "description"
            const val DATE = "date"

            const val AUTHORITY = "com.ismail.mynotesapp"
            const val SCHEME = "content"

            // untuk membuat URI content://com.ismail.consumerapp/note
            val CONTENT_URI: Uri = Uri.Builder().scheme(SCHEME)
                .authority(AUTHORITY)
                .appendPath(TABLE_NAME)
                .build()
        }

    }
}
