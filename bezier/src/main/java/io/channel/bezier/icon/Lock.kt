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

val BezierIcon.Lock: ImageVector
    get() {
        return _lock ?: ImageVector.Builder(
                name = "Lock",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(11.9984f, 18.0001f)
                curveTo(11.4461f, 18.0001f, 10.9984f, 17.5524f, 10.9984f, 17.0001f)
                lineTo(10.9984f, 14.0001f)
                curveTo(10.9984f, 13.4478f, 11.4461f, 13.0001f, 11.9984f, 13.0001f)
                curveTo(12.5507f, 13.0001f, 12.9984f, 13.4478f, 12.9984f, 14.0001f)
                lineTo(12.9984f, 17.0001f)
                curveTo(12.9984f, 17.5524f, 12.5507f, 18.0001f, 11.9984f, 18.0001f)
                close()
            }

            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(5.4998f, 9.0001f)
                lineTo(5.9998f, 9.0001f)
                lineTo(5.9998f, 7.0f)
                curveTo(5.9998f, 3.686f, 8.6862f, 1.0f, 11.9998f, 1.0f)
                curveTo(15.3141f, 1.0f, 17.9998f, 3.6857f, 17.9998f, 7.0f)
                lineTo(17.9998f, 9.0001f)
                lineTo(18.4998f, 9.0001f)
                curveTo(19.3281f, 9.0001f, 19.9998f, 9.6718f, 19.9998f, 10.5001f)
                lineTo(19.9998f, 20.5001f)
                curveTo(19.9998f, 21.3284f, 19.3281f, 22.0001f, 18.4998f, 22.0001f)
                lineTo(5.4998f, 22.0001f)
                curveTo(4.6715f, 22.0001f, 3.9998f, 21.3284f, 3.9998f, 20.5001f)
                lineTo(3.9998f, 10.5001f)
                curveTo(3.9998f, 9.6718f, 4.6715f, 9.0001f, 5.4998f, 9.0001f)
                close()
                moveTo(15.9998f, 7.0f)
                lineTo(15.9998f, 9.0001f)
                lineTo(7.9998f, 9.0001f)
                lineTo(7.9998f, 7.0f)
                curveTo(7.9998f, 4.7907f, 9.7907f, 3.0f, 11.9998f, 3.0f)
                curveTo(14.2095f, 3.0f, 15.9998f, 4.7903f, 15.9998f, 7.0f)
                close()
                moveTo(17.9998f, 11.0001f)
                lineTo(17.9998f, 20.0001f)
                lineTo(5.9998f, 20.0001f)
                lineTo(5.9998f, 11.0001f)
                lineTo(17.9998f, 11.0001f)
                close()
            }
        }.build().also {
            _lock = it
        }
    }

private var _lock: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun LockIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Lock,
            contentDescription = null,
    )
}
