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

val BezierIcon.AutoClose: ImageVector
    get() {
        return _autoClose ?: ImageVector.Builder(
                name = "AutoClose",
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
                moveTo(11.6741f, 8.7851f)
                curveTo(11.7969f, 9.0716f, 12.2031f, 9.0716f, 12.3259f, 8.7851f)
                lineTo(13.0637f, 7.0637f)
                lineTo(14.7851f, 6.3259f)
                curveTo(15.0716f, 6.2031f, 15.0716f, 5.7969f, 14.7851f, 5.6741f)
                lineTo(13.0637f, 4.9363f)
                lineTo(12.3259f, 3.2149f)
                curveTo(12.2031f, 2.9284f, 11.7969f, 2.9284f, 11.6741f, 3.2149f)
                lineTo(10.9363f, 4.9363f)
                lineTo(9.2149f, 5.6741f)
                curveTo(8.9284f, 5.7969f, 8.9284f, 6.2031f, 9.2149f, 6.3259f)
                lineTo(10.9363f, 7.0637f)
                lineTo(11.6741f, 8.7851f)
                close()
                moveTo(17.6741f, 20.7851f)
                curveTo(17.7969f, 21.0716f, 18.2031f, 21.0716f, 18.3259f, 20.7851f)
                lineTo(19.0637f, 19.0637f)
                lineTo(20.7851f, 18.3259f)
                curveTo(21.0716f, 18.2031f, 21.0716f, 17.7969f, 20.7851f, 17.6741f)
                lineTo(19.0637f, 16.9363f)
                lineTo(18.3259f, 15.2149f)
                curveTo(18.2031f, 14.9284f, 17.7969f, 14.9284f, 17.6741f, 15.2149f)
                lineTo(16.9363f, 16.9363f)
                lineTo(15.2149f, 17.6741f)
                curveTo(14.9284f, 17.7969f, 14.9284f, 18.2031f, 15.2149f, 18.3259f)
                lineTo(16.9363f, 19.0637f)
                lineTo(17.6741f, 20.7851f)
                close()
                moveTo(4.121f, 11.192f)
                lineTo(9.071f, 16.142f)
                lineTo(19.4324f, 5.7804f)
                curveTo(19.8229f, 5.3899f, 20.456f, 5.3899f, 20.8464f, 5.7804f)
                curveTo(21.2369f, 6.1709f, 21.2369f, 6.8039f, 20.8464f, 7.1944f)
                lineTo(9.7781f, 18.2629f)
                curveTo(9.3876f, 18.6534f, 8.7544f, 18.6534f, 8.3639f, 18.2629f)
                lineTo(2.707f, 12.606f)
                curveTo(2.3165f, 12.2155f, 2.3165f, 11.5825f, 2.707f, 11.192f)
                curveTo(3.0974f, 10.8015f, 3.7305f, 10.8015f, 4.121f, 11.192f)
                close()
            }
        }.build().also {
            _autoClose = it
        }
    }

private var _autoClose: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun AutoCloseIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.AutoClose,
            contentDescription = null,
    )
}
