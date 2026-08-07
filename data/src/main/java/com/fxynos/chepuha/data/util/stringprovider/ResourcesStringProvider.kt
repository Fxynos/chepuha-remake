package com.fxynos.chepuha.data.util.stringprovider

import android.content.Context
import android.content.res.Resources
import androidx.annotation.StringRes

class ResourcesStringProvider(private val resources: Resources) : StringProvider {

    constructor(context: Context) : this(context.resources)

    override fun string(@StringRes id: Int): String = resources.getString(id)
}