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

val BezierIcon.SendForwardFailedFilled: ImageVector
    get() {
        return io.channel.bezier.icon._sendForwardFailedFilled ?: ImageVector.Builder(
                name = "SendForwardFailedFilled",
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
                curveTo(2.518f, 5.0099f, 2.1551f, 5.2494f, 1.999f, 5.619f)
                curveTo(1.8415f, 5.9882f, 1.9204f, 6.4149f, 2.198f, 6.7038f)
                lineTo(7.7478f, 12.4762f)
                lineTo(17.7177f, 7.4545f)
                lineTo(18.0687f, 8.0625f)
                lineTo(8.7452f, 14.2098f)
                lineTo(10.9214f, 21.9311f)
                curveTo(11.0307f, 22.3184f, 11.3609f, 22.6023f, 11.7599f, 22.6514f)
                curveTo(11.9807f, 22.6798f, 12.1992f, 22.6322f, 12.3836f, 22.5257f)
                curveTo(12.5175f, 22.4484f, 12.6342f, 22.34f, 12.7217f, 22.2066f)
                curveTo(11.6569f, 21.1238f, 11.0f, 19.6386f, 11.0f, 18.0f)
                curveTo(11.0f, 14.6863f, 13.6863f, 12.0f, 17.0f, 12.0f)
                curveTo(17.52f, 12.0f, 18.0245f, 12.0661f, 18.5057f, 12.1905f)
                lineTo(21.7846f, 6.5106f)
                curveTo(21.964f, 6.2015f, 21.9636f, 5.8207f, 21.7846f, 5.5106f)
                curveTo(21.6061f, 5.2015f, 21.2765f, 5.0107f, 20.9186f, 5.0107f)
                close()
                moveTo(15.7152f, 20.6991f)
                curveTo(16.1062f, 20.8861f, 16.5382f, 21.0001f, 17.0002f, 21.0001f)
                curveTo(18.6542f, 21.0001f, 20.0002f, 19.6541f, 20.0002f, 18.0001f)
                curveTo(20.0002f, 17.5381f, 19.8862f, 17.1061f, 19.6992f, 16.7151f)
                lineTo(15.7152f, 20.6991f)
                close()
                moveTo(18.2852f, 15.3011f)
                curveTo(17.8942f, 15.1131f, 17.4612f, 15.0001f, 17.0002f, 15.0001f)
                curveTo(15.3462f, 15.0001f, 14.0002f, 16.3461f, 14.0002f, 18.0001f)
                curveTo(14.0002f, 18.4621f, 14.1132f, 18.8941f, 14.3012f, 19.2851f)
                lineTo(18.2852f, 15.3011f)
                close()
                moveTo(12.0002f, 18.0001f)
                curveTo(12.0002f, 15.2381f, 14.2382f, 13.0001f, 17.0002f, 13.0001f)
                curveTo(19.7612f, 13.0001f, 22.0002f, 15.2381f, 22.0002f, 18.0001f)
                curveTo(22.0002f, 20.7611f, 19.7612f, 23.0001f, 17.0002f, 23.0001f)
                curveTo(14.2382f, 23.0001f, 12.0002f, 20.7611f, 12.0002f, 18.0001f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._sendForwardFailedFilled = it
        }
    }

private var _sendForwardFailedFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SendForwardFailedFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.SendForwardFailedFilled,
            contentDescription = null,
    )
}
