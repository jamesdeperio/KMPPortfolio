package ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp


object NavigationIcon {
    val AboutMe: ImageVector
        get() = ImageVector.Builder(
    name = "face",
    defaultWidth = 40.0.dp,
    defaultHeight = 40.0.dp,
    viewportWidth = 40.0f,
    viewportHeight = 40.0f
    ).apply {
        path(
            fill = SolidColor(Color.Black),
            fillAlpha = 1f,
            stroke = null,
            strokeAlpha = 1f,
            strokeLineWidth = 1.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 1f,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.875f, 23.875f)
            quadToRelative(-0.917f, 0f, -1.542f, -0.625f)
            reflectiveQuadToRelative(-0.625f, -1.542f)
            quadToRelative(0f, -0.916f, 0.646f, -1.541f)
            quadToRelative(0.646f, -0.625f, 1.521f, -0.625f)
            quadToRelative(0.917f, 0f, 1.542f, 0.646f)
            quadToRelative(0.625f, 0.645f, 0.625f, 1.52f)
            quadToRelative(0f, 0.917f, -0.625f, 1.542f)
            reflectiveQuadToRelative(-1.542f, 0.625f)
            close()
            moveToRelative(10.25f, 0f)
            quadToRelative(-0.917f, 0f, -1.542f, -0.625f)
            reflectiveQuadToRelative(-0.625f, -1.542f)
            quadToRelative(0f, -0.916f, 0.646f, -1.541f)
            quadToRelative(0.646f, -0.625f, 1.521f, -0.625f)
            quadToRelative(0.917f, 0f, 1.542f, 0.646f)
            quadToRelative(0.625f, 0.645f, 0.625f, 1.52f)
            quadToRelative(0f, 0.917f, -0.625f, 1.542f)
            reflectiveQuadToRelative(-1.542f, 0.625f)
            close()
            moveTo(20f, 33.75f)
            quadToRelative(5.75f, 0f, 9.75f, -4f)
            reflectiveQuadToRelative(4f, -9.75f)
            quadToRelative(0f, -1.042f, -0.146f, -2.042f)
            quadToRelative(-0.146f, -1f, -0.437f, -1.875f)
            quadToRelative(-0.834f, 0.209f, -1.75f, 0.292f)
            quadToRelative(-0.917f, 0.083f, -1.959f, 0.083f)
            quadToRelative(-3.916f, 0f, -7.416f, -1.625f)
            quadToRelative(-3.5f, -1.625f, -5.959f, -4.625f)
            quadToRelative(-1.375f, 3.292f, -3.937f, 5.75f)
            quadToRelative(-2.563f, 2.459f, -5.896f, 3.75f)
            verticalLineTo(20f)
            quadToRelative(0f, 5.75f, 4f, 9.75f)
            reflectiveQuadToRelative(9.75f, 4f)
            close()
            moveToRelative(0f, 2.625f)
            quadToRelative(-3.417f, 0f, -6.396f, -1.292f)
            quadToRelative(-2.979f, -1.291f, -5.208f, -3.5f)
            quadToRelative(-2.229f, -2.208f, -3.5f, -5.187f)
            reflectiveQuadTo(3.625f, 20f)
            quadToRelative(0f, -3.417f, 1.292f, -6.396f)
            quadToRelative(1.291f, -2.979f, 3.5f, -5.208f)
            quadToRelative(2.208f, -2.229f, 5.187f, -3.5f)
            reflectiveQuadTo(20f, 3.625f)
            quadToRelative(3.417f, 0f, 6.396f, 1.292f)
            quadToRelative(2.979f, 1.291f, 5.208f, 3.5f)
            quadToRelative(2.229f, 2.208f, 3.5f, 5.187f)
            reflectiveQuadTo(36.375f, 20f)
            quadToRelative(0f, 3.417f, -1.292f, 6.396f)
            quadToRelative(-1.291f, 2.979f, -3.5f, 5.208f)
            quadToRelative(-2.208f, 2.229f, -5.187f, 3.5f)
            reflectiveQuadTo(20f, 36.375f)
            close()
        }
    }.build()



    val WorkExperience: ImageVector
        get() =  ImageVector.Builder(
            name = "work_history",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(19.417f, 30f)
                quadToRelative(0f, 1.25f, 0.291f, 2.438f)
                quadToRelative(0.292f, 1.187f, 0.875f, 2.312f)
                horizontalLineTo(6.25f)
                quadToRelative(-1.083f, 0f, -1.854f, -0.792f)
                quadToRelative(-0.771f, -0.791f, -0.771f, -1.833f)
                verticalLineTo(12.5f)
                quadToRelative(0f, -1.083f, 0.771f, -1.854f)
                quadToRelative(0.771f, -0.771f, 1.854f, -0.771f)
                horizontalLineToRelative(7.542f)
                verticalLineToRelative(-3.5f)
                quadToRelative(0f, -1.042f, 0.77f, -1.854f)
                quadToRelative(0.771f, -0.813f, 1.855f, -0.813f)
                horizontalLineToRelative(7.166f)
                quadToRelative(1.084f, 0f, 1.855f, 0.813f)
                quadToRelative(0.77f, 0.812f, 0.77f, 1.854f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(7.542f)
                quadToRelative(1.083f, 0f, 1.854f, 0.771f)
                quadToRelative(0.771f, 0.771f, 0.771f, 1.854f)
                verticalLineToRelative(9.125f)
                quadTo(35f, 20.542f, 33.396f, 19.979f)
                quadToRelative(-1.604f, -0.562f, -3.396f, -0.562f)
                quadToRelative(-4.375f, 0f, -7.479f, 3.104f)
                reflectiveQuadTo(19.417f, 30f)
                close()
                moveToRelative(-3f, -20.125f)
                horizontalLineToRelative(7.166f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-7.166f)
                close()
                moveTo(30f, 37.958f)
                quadToRelative(-3.25f, 0f, -5.604f, -2.354f)
                reflectiveQuadTo(22.042f, 30f)
                quadToRelative(0f, -3.25f, 2.354f, -5.604f)
                reflectiveQuadTo(30f, 22.042f)
                quadToRelative(3.25f, 0f, 5.604f, 2.354f)
                reflectiveQuadTo(37.958f, 30f)
                quadToRelative(0f, 3.25f, -2.354f, 5.604f)
                reflectiveQuadTo(30f, 37.958f)
                close()
                moveToRelative(2.958f, -3.916f)
                lineToRelative(1.084f, -1.084f)
                lineToRelative(-3.334f, -3.083f)
                verticalLineToRelative(-4.958f)
                horizontalLineToRelative(-1.666f)
                verticalLineToRelative(5.458f)
                close()
            }
        }.build()


    val Skill: ImageVector
        get() = ImageVector.Builder(
            name = "lightbulb",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(20f, 36.417f)
                quadToRelative(-1.375f, 0f, -2.333f, -0.959f)
                quadToRelative(-0.959f, -0.958f, -0.959f, -2.333f)
                horizontalLineToRelative(6.584f)
                quadToRelative(0f, 1.375f, -0.959f, 2.333f)
                quadToRelative(-0.958f, 0.959f, -2.333f, 0.959f)
                close()
                moveToRelative(-5.292f, -5.625f)
                quadToRelative(-0.541f, 0f, -0.937f, -0.396f)
                reflectiveQuadToRelative(-0.396f, -0.938f)
                quadToRelative(0f, -0.541f, 0.396f, -0.937f)
                reflectiveQuadToRelative(0.937f, -0.396f)
                horizontalLineToRelative(10.584f)
                quadToRelative(0.541f, 0f, 0.937f, 0.396f)
                reflectiveQuadToRelative(0.396f, 0.937f)
                quadToRelative(0f, 0.542f, -0.396f, 0.938f)
                quadToRelative(-0.396f, 0.396f, -0.937f, 0.396f)
                close()
                moveToRelative(-1.083f, -4.959f)
                quadToRelative(-2.708f, -1.75f, -4.313f, -4.437f)
                quadToRelative(-1.604f, -2.688f, -1.604f, -5.979f)
                quadToRelative(0f, -5.042f, 3.646f, -8.667f)
                reflectiveQuadTo(20f, 3.125f)
                quadToRelative(5f, 0f, 8.646f, 3.625f)
                quadToRelative(3.646f, 3.625f, 3.646f, 8.667f)
                quadToRelative(0f, 3.291f, -1.584f, 5.979f)
                quadToRelative(-1.583f, 2.687f, -4.333f, 4.437f)
                close()
            }
        }.build()


    val Portfolio: ImageVector
        get() = ImageVector.Builder(
            name = "gallery_thumbnail",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4.375f, 31.583f)
                quadToRelative(-1.125f, 0f, -1.875f, -0.75f)
                reflectiveQuadToRelative(-0.75f, -1.875f)
                verticalLineTo(11.042f)
                quadToRelative(0f, -1.125f, 0.75f, -1.896f)
                quadToRelative(0.75f, -0.771f, 1.875f, -0.771f)
                horizontalLineToRelative(17.917f)
                quadToRelative(1.125f, 0f, 1.896f, 0.771f)
                quadToRelative(0.77f, 0.771f, 0.77f, 1.896f)
                verticalLineToRelative(17.916f)
                quadToRelative(0f, 1.125f, -0.77f, 1.875f)
                quadToRelative(-0.771f, 0.75f, -1.896f, 0.75f)
                close()
                moveTo(30f, 18.25f)
                quadToRelative(-0.667f, 0f, -1.125f, -0.458f)
                quadToRelative(-0.458f, -0.459f, -0.458f, -1.125f)
                verticalLineTo(10f)
                quadToRelative(0f, -0.667f, 0.458f, -1.146f)
                quadToRelative(0.458f, -0.479f, 1.125f, -0.479f)
                horizontalLineToRelative(6.667f)
                quadToRelative(0.666f, 0f, 1.145f, 0.479f)
                quadToRelative(0.48f, 0.479f, 0.48f, 1.146f)
                verticalLineToRelative(6.667f)
                quadToRelative(0f, 0.666f, -0.48f, 1.125f)
                quadToRelative(-0.479f, 0.458f, -1.145f, 0.458f)
                close()
                moveTo(8.125f, 24.917f)
                horizontalLineToRelative(10.417f)
                quadToRelative(0.416f, 0f, 0.583f, -0.355f)
                quadToRelative(0.167f, -0.354f, -0.042f, -0.687f)
                lineTo(16.167f, 20f)
                quadToRelative(-0.209f, -0.292f, -0.542f, -0.292f)
                quadToRelative(-0.333f, 0f, -0.542f, 0.292f)
                lineTo(12.5f, 23.458f)
                lineToRelative(-1.75f, -2.333f)
                quadToRelative(-0.208f, -0.292f, -0.542f, -0.292f)
                quadToRelative(-0.333f, 0f, -0.541f, 0.292f)
                lineToRelative(-2.084f, 2.75f)
                quadToRelative(-0.208f, 0.333f, -0.041f, 0.687f)
                quadToRelative(0.166f, 0.355f, 0.583f, 0.355f)
                close()
                moveTo(30f, 31.583f)
                quadToRelative(-0.667f, 0f, -1.125f, -0.458f)
                quadToRelative(-0.458f, -0.458f, -0.458f, -1.125f)
                verticalLineToRelative(-6.667f)
                quadToRelative(0f, -0.666f, 0.458f, -1.145f)
                quadToRelative(0.458f, -0.48f, 1.125f, -0.48f)
                horizontalLineToRelative(6.667f)
                quadToRelative(0.666f, 0f, 1.145f, 0.48f)
                quadToRelative(0.48f, 0.479f, 0.48f, 1.145f)
                verticalLineTo(30f)
                quadToRelative(0f, 0.667f, -0.48f, 1.125f)
                quadToRelative(-0.479f, 0.458f, -1.145f, 0.458f)
                close()
            }
        }.build()
}