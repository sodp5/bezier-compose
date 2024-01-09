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

val BezierIcon.ArrowLeftDownSmall: ImageVector
    get() {
        return _arrowLeftDownSmall ?: ImageVector.Builder(
                name = "ArrowLeftDownSmall",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(16.9498f, 7.0503f)
                curveTo(16.5592f, 6.6598f, 15.9261f, 6.6598f, 15.5356f, 7.0503f)
                lineTo(8.7574f, 13.8285f)
                lineTo(8.7574f, 8.4646f)
                curveTo(8.7574f, 7.9123f, 8.3097f, 7.4646f, 7.7574f, 7.4646f)
                curveTo(7.2051f, 7.4646f, 6.7574f, 7.9123f, 6.7574f, 8.4646f)
                lineTo(6.7574f, 16.2427f)
                curveTo(6.7574f, 16.795f, 7.2051f, 17.2427f, 7.7574f, 17.2427f)
                lineTo(15.5356f, 17.2427f)
                curveTo(16.0878f, 17.2427f, 16.5356f, 16.795f, 16.5356f, 16.2427f)
                curveTo(16.5356f, 15.6904f, 16.0878f, 15.2427f, 15.5356f, 15.2427f)
                lineTo(10.1716f, 15.2427f)
                lineTo(16.9498f, 8.4646f)
                curveTo(17.3403f, 8.074f, 17.3403f, 7.4409f, 16.9498f, 7.0503f)
                close()
            }
        }.build().also {
            _arrowLeftDownSmall = it
        }
    }

private var _arrowLeftDownSmall: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ArrowLeftDownSmallIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ArrowLeftDownSmall,
            contentDescription = null,
    )
}