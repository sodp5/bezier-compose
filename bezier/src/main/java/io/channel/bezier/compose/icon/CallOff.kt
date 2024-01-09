@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.compose.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.BezierIcon

val BezierIcon.CallOff: ImageVector
    get() {
        return _callOff ?: ImageVector.Builder(
                name = "CallOff",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(22.5f, 13.4783f)
                curveTo(22.5f, 11.1957f, 19.3044f, 8.0f, 12.0f, 8.0f)
                curveTo(4.6957f, 8.0f, 1.5f, 11.1957f, 1.5f, 13.4783f)
                curveTo(1.5f, 14.8478f, 2.3154f, 16.0348f, 3.3261f, 16.2174f)
                curveTo(4.2391f, 16.4f, 6.0916f, 16.191f, 6.9783f, 15.3043f)
                curveTo(7.8913f, 14.3913f, 7.4358f, 12.5465f, 7.8913f, 12.1087f)
                curveTo(8.3468f, 11.6709f, 10.0f, 11.0f, 12.0f, 11.0f)
                curveTo(14.0f, 11.0f, 15.6532f, 11.6709f, 16.1087f, 12.1087f)
                curveTo(16.5642f, 12.5465f, 16.1087f, 14.3913f, 17.0217f, 15.3043f)
                curveTo(17.9084f, 16.191f, 19.7609f, 16.4f, 20.6739f, 16.2174f)
                curveTo(21.6847f, 16.0348f, 22.5f, 14.8478f, 22.5f, 13.4783f)
                close()
            }
        }.build().also {
            _callOff = it
        }
    }

private var _callOff: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CallOffIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.CallOff,
            contentDescription = null,
    )
}