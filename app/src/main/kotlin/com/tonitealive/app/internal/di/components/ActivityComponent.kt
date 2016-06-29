package com.tonitealive.app.internal.di.components

import android.app.Activity
import com.tonitealive.app.internal.di.annotations.PerActivity
import com.tonitealive.app.internal.di.modules.ActivityModule
import dagger.Component

@PerActivity
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun activity(): Activity

}