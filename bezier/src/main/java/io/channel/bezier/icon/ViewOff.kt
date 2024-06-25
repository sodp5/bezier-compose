@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons

val BezierIcons.ViewOff: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _viewOff ?: ImageVector.Builder(
                    name = "ViewOff",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                ) {
                    moveTo(16.4157f, 13.547f)
                    curveTo(16.4157f, 11.278f, 14.5767f, 9.44002f, 12.3087f, 9.44002f)
                    curveTo(12.0747f, 9.44002f, 11.8467f, 9.46402f, 11.6237f, 9.50302f)
                    lineTo(10.3937f, 8.27302f)
                    curveTo(11.0167f, 8.12702f, 11.6547f, 8.04302f, 12.3087f, 8.04302f)
                    curveTo(15.4316f, 8.04302f, 18.2977f, 9.7131f, 20.1399f, 12.5595f)
                    curveTo(20.4399f, 13.023f, 21.0416f, 13.2107f, 21.5289f, 12.9511f)
                    curveTo(22.0164f, 12.6915f, 22.2041f, 12.0831f, 21.9101f, 11.6155f)
                    curveTo(19.7041f, 8.1079f, 16.1784f, 6.04302f, 12.3087f, 6.04302f)
                    curveTo(11.0887f, 6.04302f, 9.91366f, 6.27702f, 8.79466f, 6.67402f)
                    lineTo(4.57564f, 2.45413f)
                    curveTo(4.1852f, 2.06362f, 3.5521f, 2.06358f, 3.16162f, 2.45406f)
                    curveTo(2.77117f, 2.84451f, 2.77117f, 3.47754f, 3.1616f, 3.86799f)
                    lineTo(20.1317f, 20.839f)
                    curveTo(20.5221f, 21.2295f, 21.1552f, 21.2295f, 21.5457f, 20.839f)
                    curveTo(21.9361f, 20.4485f, 21.9361f, 19.8155f, 21.5457f, 19.425f)
                    lineTo(16.3527f, 14.232f)
                    curveTo(16.3917f, 14.009f, 16.4157f, 13.781f, 16.4157f, 13.547f)
                    close()
                    moveTo(8.20127f, 13.547f)
                    curveTo(8.20127f, 15.816f, 10.0403f, 17.654f, 12.3083f, 17.654f)
                    curveTo(13.2173f, 17.654f, 14.0493f, 17.35f, 14.7293f, 16.85f)
                    lineTo(9.00527f, 11.127f)
                    curveTo(8.50527f, 11.807f, 8.20127f, 12.638f, 8.20127f, 13.547f)
                    close()
                    moveTo(3.08844f, 12.9508f)
                    curveTo(2.60095f, 12.6911f, 2.41307f, 12.0829f, 2.70857f, 11.6163f)
                    curveTo(3.60768f, 10.1965f, 4.73019f, 9.02479f, 5.99666f, 8.11861f)
                    lineTo(7.42466f, 9.54561f)
                    curveTo(6.29022f, 10.2995f, 5.28507f, 11.3153f, 4.47777f, 12.5595f)
                    curveTo(4.17729f, 13.0227f, 3.57571f, 13.2103f, 3.08844f, 12.9508f)
                    close()
                }
            }.build().also {
                _viewOff = it
            }
    }


private var _viewOff: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ViewOffIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ViewOff.imageVector,
            contentDescription = null,
    )
}
