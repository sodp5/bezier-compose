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

val BezierIcons.MapPin: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _mapPin ?: ImageVector.Builder(
                    name = "MapPin",
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
                    moveTo(12.0006f, 12.732f)
                    curveTo(10.2256f, 12.732f, 8.78656f, 11.293f, 8.78656f, 9.51798f)
                    curveTo(8.78656f, 7.74198f, 10.2256f, 6.30298f, 12.0006f, 6.30298f)
                    curveTo(13.7756f, 6.30298f, 15.2146f, 7.74198f, 15.2146f, 9.51798f)
                    curveTo(15.2146f, 11.293f, 13.7756f, 12.732f, 12.0006f, 12.732f)
                    close()
                    moveTo(18.2566f, 5.33201f)
                    curveTo(15.2166f, 0.889006f, 8.78457f, 0.889006f, 5.74357f, 5.33201f)
                    curveTo(3.98257f, 7.90501f, 4.14657f, 11.345f, 5.88957f, 13.931f)
                    lineTo(11.5566f, 22.339f)
                    curveTo(11.7686f, 22.655f, 12.2326f, 22.655f, 12.4446f, 22.339f)
                    lineTo(18.1106f, 13.931f)
                    curveTo(19.8536f, 11.345f, 20.0186f, 7.90501f, 18.2566f, 5.33201f)
                    close()
                }
            }.build().also {
                _mapPin = it
            }
    }


private var _mapPin: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun MapPinIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.MapPin.imageVector,
            contentDescription = null,
    )
}
