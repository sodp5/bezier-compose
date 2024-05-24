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

val BezierIcon.Checkbox: ImageVector
    get() {
        return io.channel.bezier.icon._checkbox ?: ImageVector.Builder(
                name = "Checkbox",
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
                moveTo(16.0f, 5.0f)
                lineTo(8.0f, 5.0f)
                curveTo(6.3432f, 5.0f, 5.0f, 6.3432f, 5.0f, 8.0f)
                lineTo(5.0f, 16.0f)
                curveTo(5.0f, 17.6569f, 6.3432f, 19.0f, 8.0f, 19.0f)
                lineTo(16.0f, 19.0f)
                curveTo(17.6569f, 19.0f, 19.0f, 17.6569f, 19.0f, 16.0f)
                lineTo(19.0f, 8.0f)
                curveTo(19.0f, 6.3432f, 17.6569f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(8.0f, 3.0f)
                curveTo(5.2386f, 3.0f, 3.0f, 5.2386f, 3.0f, 8.0f)
                lineTo(3.0f, 16.0f)
                curveTo(3.0f, 18.7614f, 5.2386f, 21.0f, 8.0f, 21.0f)
                lineTo(16.0f, 21.0f)
                curveTo(18.7614f, 21.0f, 21.0f, 18.7614f, 21.0f, 16.0f)
                lineTo(21.0f, 8.0f)
                curveTo(21.0f, 5.2386f, 18.7614f, 3.0f, 16.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                close()
                moveTo(10.6666f, 13.3756f)
                lineTo(15.3806f, 8.6615f)
                curveTo(15.7712f, 8.271f, 16.4043f, 8.271f, 16.7948f, 8.6615f)
                curveTo(17.1854f, 9.0521f, 17.1854f, 9.6852f, 16.7948f, 10.0758f)
                lineTo(10.9754f, 15.8952f)
                curveTo(10.8048f, 16.0658f, 10.5283f, 16.0658f, 10.3578f, 15.8952f)
                lineTo(7.205f, 12.7424f)
                curveTo(6.8145f, 12.3519f, 6.8145f, 11.7187f, 7.205f, 11.3282f)
                curveTo(7.5955f, 10.9377f, 8.2287f, 10.9377f, 8.6192f, 11.3282f)
                lineTo(10.6666f, 13.3756f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._checkbox = it
        }
    }

private var _checkbox: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CheckboxIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Checkbox,
            contentDescription = null,
    )
}
