package com.example.androidstudy.ui.theme

import android.app.Activity
import android.os.Build
import android.view.View
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.example.androidstudy.ui.theme.SuperheroesShapes
import com.example.androidstudy.ui.theme.ThirtyDaysShapes
import com.example.androidstudy.ui.theme.WoofShapes

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun AndroidStudyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

private val WoofDarkColorScheme = darkColorScheme(
    primary = woof_md_theme_dark_primary,
    onPrimary = woof_md_theme_dark_onPrimary,
    primaryContainer = woof_md_theme_dark_primaryContainer,
    onPrimaryContainer = woof_md_theme_dark_onPrimaryContainer,
    secondary = woof_md_theme_dark_secondary,
    onSecondary = woof_md_theme_dark_onSecondary,
    secondaryContainer = woof_md_theme_dark_secondaryContainer,
    onSecondaryContainer = woof_md_theme_dark_onSecondaryContainer,
    tertiary = woof_md_theme_dark_tertiary,
    onTertiary = woof_md_theme_dark_onTertiary,
    tertiaryContainer = woof_md_theme_dark_tertiaryContainer,
    onTertiaryContainer = woof_md_theme_dark_onTertiaryContainer,
    error = woof_md_theme_dark_error,
    errorContainer = woof_md_theme_dark_errorContainer,
    onError = woof_md_theme_dark_onError,
    onErrorContainer = woof_md_theme_dark_onErrorContainer,
    background = woof_md_theme_dark_background,
    onBackground = woof_md_theme_dark_onBackground,
    surface = woof_md_theme_dark_surface,
    onSurface = woof_md_theme_dark_onSurface,
    surfaceVariant = woof_md_theme_dark_surfaceVariant,
    onSurfaceVariant = woof_md_theme_dark_onSurfaceVariant,
    outline = woof_md_theme_dark_outline,
    inverseOnSurface = woof_md_theme_dark_inverseOnSurface,
    inverseSurface = woof_md_theme_dark_inverseSurface,
    inversePrimary = woof_md_theme_dark_inversePrimary,
    surfaceTint = woof_md_theme_dark_surfaceTint,
    outlineVariant = woof_md_theme_dark_outlineVariant,
    scrim = woof_md_theme_dark_scrim,
)

private val WoofLightColorScheme = lightColorScheme(
    primary = woof_md_theme_light_primary,
    onPrimary = woof_md_theme_light_onPrimary,
    primaryContainer = woof_md_theme_light_primaryContainer,
    onPrimaryContainer = woof_md_theme_light_onPrimaryContainer,
    secondary = woof_md_theme_light_secondary,
    onSecondary = woof_md_theme_light_onSecondary,
    secondaryContainer = woof_md_theme_light_secondaryContainer,
    onSecondaryContainer = woof_md_theme_light_onSecondaryContainer,
    tertiary = woof_md_theme_light_tertiary,
    onTertiary = woof_md_theme_light_onTertiary,
    tertiaryContainer = woof_md_theme_light_tertiaryContainer,
    onTertiaryContainer = woof_md_theme_light_onTertiaryContainer,
    error = woof_md_theme_light_error,
    errorContainer = woof_md_theme_light_errorContainer,
    onError = woof_md_theme_light_onError,
    onErrorContainer = woof_md_theme_light_onErrorContainer,
    background = woof_md_theme_light_background,
    onBackground = woof_md_theme_light_onBackground,
    surface = woof_md_theme_light_surface,
    onSurface = woof_md_theme_light_onSurface,
    surfaceVariant = woof_md_theme_light_surfaceVariant,
    onSurfaceVariant = woof_md_theme_light_onSurfaceVariant,
    outline = woof_md_theme_light_outline,
    inverseOnSurface = woof_md_theme_light_inverseOnSurface,
    inverseSurface = woof_md_theme_light_inverseSurface,
    inversePrimary = woof_md_theme_light_inversePrimary,
    surfaceTint = woof_md_theme_light_surfaceTint,
    outlineVariant = woof_md_theme_light_outlineVariant,
    scrim = woof_md_theme_light_scrim,
)

@Composable
fun WoofTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> WoofDarkColorScheme
        else -> WoofLightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = WoofTypography,
        shapes = WoofShapes,
        content = content
    )
}

private val SuperheroesLightColors = lightColorScheme(
    primary = superheroes_md_theme_light_primary,
    onPrimary = superheroes_md_theme_light_onPrimary,
    primaryContainer = superheroes_md_theme_light_primaryContainer,
    onPrimaryContainer = superheroes_md_theme_light_onPrimaryContainer,
    secondary = superheroes_md_theme_light_secondary,
    onSecondary = superheroes_md_theme_light_onSecondary,
    secondaryContainer = superheroes_md_theme_light_secondaryContainer,
    onSecondaryContainer = superheroes_md_theme_light_onSecondaryContainer,
    tertiary = superheroes_md_theme_light_tertiary,
    onTertiary = superheroes_md_theme_light_onTertiary,
    tertiaryContainer = superheroes_md_theme_light_tertiaryContainer,
    onTertiaryContainer = superheroes_md_theme_light_onTertiaryContainer,
    error = superheroes_md_theme_light_error,
    errorContainer = superheroes_md_theme_light_errorContainer,
    onError = superheroes_md_theme_light_onError,
    onErrorContainer = superheroes_md_theme_light_onErrorContainer,
    background = superheroes_md_theme_light_background,
    onBackground = superheroes_md_theme_light_onBackground,
    surface = superheroes_md_theme_light_surface,
    onSurface = superheroes_md_theme_light_onSurface,
    surfaceVariant = superheroes_md_theme_light_surfaceVariant,
    onSurfaceVariant = superheroes_md_theme_light_onSurfaceVariant,
    outline = superheroes_md_theme_light_outline,
    inverseOnSurface = superheroes_md_theme_light_inverseOnSurface,
    inverseSurface = superheroes_md_theme_light_inverseSurface,
    inversePrimary = superheroes_md_theme_light_inversePrimary,
    surfaceTint = superheroes_md_theme_light_surfaceTint,
    outlineVariant = superheroes_md_theme_light_outlineVariant,
    scrim = superheroes_md_theme_light_scrim,
)

private val SuperheroesDarkColors = darkColorScheme(
    primary = superheroes_md_theme_dark_primary,
    onPrimary = superheroes_md_theme_dark_onPrimary,
    primaryContainer = superheroes_md_theme_dark_primaryContainer,
    onPrimaryContainer = superheroes_md_theme_dark_onPrimaryContainer,
    secondary = superheroes_md_theme_dark_secondary,
    onSecondary = superheroes_md_theme_dark_onSecondary,
    secondaryContainer = superheroes_md_theme_dark_secondaryContainer,
    onSecondaryContainer = superheroes_md_theme_dark_onSecondaryContainer,
    tertiary = superheroes_md_theme_dark_tertiary,
    onTertiary = superheroes_md_theme_dark_onTertiary,
    tertiaryContainer = superheroes_md_theme_dark_tertiaryContainer,
    onTertiaryContainer = superheroes_md_theme_dark_onTertiaryContainer,
    error = superheroes_md_theme_dark_error,
    errorContainer = superheroes_md_theme_dark_errorContainer,
    onError = superheroes_md_theme_dark_onError,
    onErrorContainer = superheroes_md_theme_dark_onErrorContainer,
    background = superheroes_md_theme_dark_background,
    onBackground = superheroes_md_theme_dark_onBackground,
    surface = superheroes_md_theme_dark_surface,
    onSurface = superheroes_md_theme_dark_onSurface,
    surfaceVariant = superheroes_md_theme_dark_surfaceVariant,
    onSurfaceVariant = superheroes_md_theme_dark_onSurfaceVariant,
    outline = superheroes_md_theme_dark_outline,
    inverseOnSurface = superheroes_md_theme_dark_inverseOnSurface,
    inverseSurface = superheroes_md_theme_dark_inverseSurface,
    inversePrimary = superheroes_md_theme_dark_inversePrimary,
    surfaceTint = superheroes_md_theme_dark_surfaceTint,
    outlineVariant = superheroes_md_theme_dark_outlineVariant,
    scrim = superheroes_md_theme_dark_scrim,
)

@Composable
fun SuperheroesTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    // Dynamic color in this app is turned off for learning purposes
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> SuperheroesDarkColors
        else -> SuperheroesLightColors
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
//            val window = (view.context as Activity).window
//            window.statusBarColor = colorScheme.background.toArgb()
//            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
            setUpEdgeToEdge(view, darkTheme)
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = SuperheroesTypography,
        shapes = SuperheroesShapes,
        content = content
    )
}

private fun setUpEdgeToEdge(view: View, darkTheme: Boolean) {
    val window = (view.context as Activity).window
    WindowCompat.setDecorFitsSystemWindows(window, false)
    window.statusBarColor = Color.Transparent.toArgb()
    val navigationBarColor = when {
        Build.VERSION.SDK_INT >= 29 -> Color.Transparent.toArgb()
        Build.VERSION.SDK_INT >= 26 -> Color(0xFF, 0xFF, 0xFF, 0x63).toArgb()
        // Min sdk version for this app is 24, this block is for SDK versions 24 and 25
        else -> Color(0x00, 0x00, 0x00, 0x50).toArgb()
    }
    window.navigationBarColor = navigationBarColor
    val controller = WindowCompat.getInsetsController(window, view)
    controller.isAppearanceLightStatusBars = !darkTheme
    controller.isAppearanceLightNavigationBars = !darkTheme
}

private val ThirtyDaysLightColors = lightColorScheme(
    primary = thirtydays_md_theme_light_primary,
    onPrimary = thirtydays_md_theme_light_onPrimary,
    primaryContainer = thirtydays_md_theme_light_primaryContainer,
    onPrimaryContainer = thirtydays_md_theme_light_onPrimaryContainer,
    secondary = thirtydays_md_theme_light_secondary,
    onSecondary = thirtydays_md_theme_light_onSecondary,
    secondaryContainer = thirtydays_md_theme_light_secondaryContainer,
    onSecondaryContainer = thirtydays_md_theme_light_onSecondaryContainer,
    tertiary = thirtydays_md_theme_light_tertiary,
    onTertiary = thirtydays_md_theme_light_onTertiary,
    tertiaryContainer = thirtydays_md_theme_light_tertiaryContainer,
    onTertiaryContainer = thirtydays_md_theme_light_onTertiaryContainer,
    error = thirtydays_md_theme_light_error,
    errorContainer = thirtydays_md_theme_light_errorContainer,
    onError = thirtydays_md_theme_light_onError,
    onErrorContainer = thirtydays_md_theme_light_onErrorContainer,
    background = thirtydays_md_theme_light_background,
    onBackground = thirtydays_md_theme_light_onBackground,
    surface = thirtydays_md_theme_light_surface,
    onSurface = thirtydays_md_theme_light_onSurface,
    surfaceVariant = thirtydays_md_theme_light_surfaceVariant,
    onSurfaceVariant = thirtydays_md_theme_light_onSurfaceVariant,
    outline = thirtydays_md_theme_light_outline,
    inverseOnSurface = thirtydays_md_theme_light_inverseOnSurface,
    inverseSurface = thirtydays_md_theme_light_inverseSurface,
    inversePrimary = thirtydays_md_theme_light_inversePrimary,
    surfaceTint = thirtydays_md_theme_light_surfaceTint,
    outlineVariant = thirtydays_md_theme_light_outlineVariant,
    scrim = thirtydays_md_theme_light_scrim,
)

private val ThirtyDaysDarkColors = darkColorScheme(
    primary = thirtydays_md_theme_dark_primary,
    onPrimary = thirtydays_md_theme_dark_onPrimary,
    primaryContainer = thirtydays_md_theme_dark_primaryContainer,
    onPrimaryContainer = thirtydays_md_theme_dark_onPrimaryContainer,
    secondary = thirtydays_md_theme_dark_secondary,
    onSecondary = thirtydays_md_theme_dark_onSecondary,
    secondaryContainer = thirtydays_md_theme_dark_secondaryContainer,
    onSecondaryContainer = thirtydays_md_theme_dark_onSecondaryContainer,
    tertiary = thirtydays_md_theme_dark_tertiary,
    onTertiary = thirtydays_md_theme_dark_onTertiary,
    tertiaryContainer = thirtydays_md_theme_dark_tertiaryContainer,
    onTertiaryContainer = thirtydays_md_theme_dark_onTertiaryContainer,
    error = thirtydays_md_theme_dark_error,
    errorContainer = thirtydays_md_theme_dark_errorContainer,
    onError = thirtydays_md_theme_dark_onError,
    onErrorContainer = thirtydays_md_theme_dark_onErrorContainer,
    background = thirtydays_md_theme_dark_background,
    onBackground = thirtydays_md_theme_dark_onBackground,
    surface = thirtydays_md_theme_dark_surface,
    onSurface = thirtydays_md_theme_dark_onSurface,
    surfaceVariant = thirtydays_md_theme_dark_surfaceVariant,
    onSurfaceVariant = thirtydays_md_theme_dark_onSurfaceVariant,
    outline = thirtydays_md_theme_dark_outline,
    inverseOnSurface = thirtydays_md_theme_dark_inverseOnSurface,
    inverseSurface = thirtydays_md_theme_dark_inverseSurface,
    inversePrimary = thirtydays_md_theme_dark_inversePrimary,
    surfaceTint = thirtydays_md_theme_dark_surfaceTint,
    outlineVariant = thirtydays_md_theme_dark_outlineVariant,
    scrim = thirtydays_md_theme_dark_scrim,
)

@Composable
fun ThirtyDaysTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    // Dynamic color in this app is turned off for learning purposes
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> ThirtyDaysDarkColors
        else -> ThirtyDaysLightColors
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.background.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = ThirtyDaysTypography,
        shapes = ThirtyDaysShapes,
        content = content
    )
}
