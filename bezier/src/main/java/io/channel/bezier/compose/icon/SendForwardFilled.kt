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

val BezierIcon.SendForwardFilled: ImageVector
    get() {
        return _sendForwardFilled ?: ImageVector.Builder(
                name = "SendForwardFilled",
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
                moveTo(20.9186f, 5.0107f)
                lineTo(2.919f, 5.0104f)
                curveTo(2.5179f, 5.0099f, 2.1551f, 5.2494f, 1.999f, 5.619f)
                curveTo(1.8415f, 5.9882f, 1.9204f, 6.4149f, 2.198f, 6.7038f)
                lineTo(7.7478f, 12.4762f)
                lineTo(17.7176f, 7.4545f)
                lineTo(18.0686f, 8.0625f)
                lineTo(8.7452f, 14.2098f)
                lineTo(10.9214f, 21.9311f)
                curveTo(11.0307f, 22.3184f, 11.3609f, 22.6023f, 11.7599f, 22.6514f)
                curveTo(11.9807f, 22.6798f, 12.1991f, 22.6322f, 12.3836f, 22.5257f)
                curveTo(12.5326f, 22.4397f, 12.6604f, 22.3151f, 12.7501f, 22.1605f)
                lineTo(21.7846f, 6.5106f)
                curveTo(21.964f, 6.2015f, 21.9636f, 5.8207f, 21.7846f, 5.5107f)
                curveTo(21.6061f, 5.2015f, 21.2765f, 5.0107f, 20.9186f, 5.0107f)
                close()
            }
        }.build().also {
            _sendForwardFilled = it
        }
    }

private var _sendForwardFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SendForwardFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.SendForwardFilled,
            contentDescription = null,
    )
}