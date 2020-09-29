
# SleepTracker
The SleepQualityTracker app is a demo app that helps you collect information about your sleep.

-   Start time
-   End time
-   Quality
-   Time slept
This app is for practicing mvvm architecture
## Introduction

The application uses Clean Architecture based on MVVM.

The application is written entirely in Kotlin.

Android Jetpack is used as an Architecture glue including but not limited to ViewModel, LiveData, BindingAdapter, Lifecycles, Navigation, Room. See a complete list in "Libraries used" section.

The application  loaded data is saved to SQL based database Room.

Kotlin Coroutines manage background threads with simplified code and reducing needs for callbacks.

Navigation component manages in-app navigation.

Use DiffUtil for RecyclerView.Adapter.
## Libraries Used
- Foundation - Components for core system capabilities, Kotlin extensions and support for multidex and automated testing.

  -   AppCompat - Degrade gracefully on older versions of Android.
	-   Android KTX - Write more concise, idiomatic Kotlin code.
	-   Test - An Android testing framework for unit and integration UI tests.
	-   Architecture - A collection of libraries that help you design robust, testable, and maintainable apps. Start with classes for managing your UI component lifecycle and handling data persistence.
	-   Lifecycles - Create a UI that automatically responds to lifecycle events.
	-   LiveData - Build data objects that notify views when the underlying database changes.
	-   Navigation - Handle everything needed for in-app navigation.
	-   Room - SQLite database with in-app objects and compile-time checks.
	-   ViewModel - Store UI-related data that isn't destroyed on app rotations. Easily schedule asynchronous tasks for optimal execution.
	-   Material - Material Components.
- Third party

	-   Kotlin Coroutines - for managing background threads with simplified code 
