@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon

val BezierIcon.Cookie: ImageVector
    get() {
        return _cookie ?: ImageVector.Builder(
                name = "Cookie",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(4.0046f, 11.9996f)
                curveTo(4.0046f, 16.4106f, 7.5936f, 19.9996f, 12.0046f, 19.9996f)
                curveTo(16.4156f, 19.9996f, 20.0046f, 16.4106f, 20.0046f, 11.9996f)
                curveTo(20.0046f, 11.7696f, 19.9936f, 11.5386f, 19.9716f, 11.3026f)
                curveTo(16.1546f, 10.8926f, 13.1116f, 7.8496f, 12.7016f, 4.0326f)
                curveTo(12.4666f, 4.0106f, 12.2346f, 3.9996f, 12.0046f, 3.9996f)
                curveTo(7.5936f, 3.9996f, 4.0046f, 7.5886f, 4.0046f, 11.9996f)
                close()
                moveTo(21.6776f, 9.3496f)
                lineTo(21.8286f, 10.1666f)
                curveTo(21.9466f, 10.8016f, 22.0046f, 11.4016f, 22.0046f, 11.9996f)
                curveTo(22.0046f, 17.5136f, 17.5186f, 21.9996f, 12.0046f, 21.9996f)
                curveTo(6.4906f, 21.9996f, 2.0046f, 17.5136f, 2.0046f, 11.9996f)
                curveTo(2.0046f, 6.4856f, 6.4906f, 1.9996f, 12.0046f, 1.9996f)
                curveTo(12.5956f, 1.9996f, 13.2126f, 2.0596f, 13.8376f, 2.1746f)
                lineTo(14.6546f, 2.3266f)
                lineTo(14.6546f, 3.1576f)
                curveTo(14.6576f, 6.5686f, 17.4356f, 9.3466f, 20.8466f, 9.3496f)
                lineTo(21.6776f, 9.3496f)
                close()
                moveTo(10.0002f, 7.0001f)
                curveTo(10.9662f, 7.0001f, 11.7502f, 7.7831f, 11.7502f, 8.7501f)
                curveTo(11.7502f, 9.7161f, 10.9662f, 10.5001f, 10.0002f, 10.5001f)
                curveTo(9.0332f, 10.5001f, 8.2502f, 9.7161f, 8.2502f, 8.7501f)
                curveTo(8.2502f, 7.7831f, 9.0332f, 7.0001f, 10.0002f, 7.0001f)
                close()
                moveTo(15.0002f, 11.5001f)
                curveTo(14.0332f, 11.5001f, 13.2502f, 12.2831f, 13.2502f, 13.2501f)
                curveTo(13.2502f, 14.2161f, 14.0332f, 15.0001f, 15.0002f, 15.0001f)
                curveTo(15.9662f, 15.0001f, 16.7502f, 14.2161f, 16.7502f, 13.2501f)
                curveTo(16.7502f, 12.2831f, 15.9662f, 11.5001f, 15.0002f, 11.5001f)
                close()
                moveTo(10.2502f, 16.7501f)
                curveTo(10.2502f, 15.7831f, 11.0332f, 15.0001f, 12.0002f, 15.0001f)
                curveTo(12.9662f, 15.0001f, 13.7502f, 15.7831f, 13.7502f, 16.7501f)
                curveTo(13.7502f, 17.7161f, 12.9662f, 18.5001f, 12.0002f, 18.5001f)
                curveTo(11.0332f, 18.5001f, 10.2502f, 17.7161f, 10.2502f, 16.7501f)
                close()
            }
        }.build().also {
            _cookie = it
        }
    }

private var _cookie: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CookieIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Cookie,
            contentDescription = null,
    )
}
