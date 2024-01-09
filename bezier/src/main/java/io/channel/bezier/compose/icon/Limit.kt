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

val BezierIcon.Limit: ImageVector
    get() {
        return _limit ?: ImageVector.Builder(
                name = "Limit",
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
                moveTo(2.0f, 12.5f)
                curveTo(2.0f, 6.9771f, 6.4771f, 2.5f, 12.0f, 2.5f)
                curveTo(17.5228f, 2.5f, 22.0f, 6.9771f, 22.0f, 12.5f)
                curveTo(22.0f, 15.738f, 20.4599f, 18.6168f, 18.0764f, 20.4427f)
                curveTo(17.5624f, 20.8364f, 16.9502f, 21.0f, 16.3725f, 21.0f)
                lineTo(7.6275f, 21.0f)
                curveTo(7.0498f, 21.0f, 6.4376f, 20.8364f, 5.9236f, 20.4427f)
                curveTo(3.5401f, 18.6168f, 2.0f, 15.738f, 2.0f, 12.5f)
                close()
                moveTo(12.0f, 4.5f)
                curveTo(7.5817f, 4.5f, 4.0f, 8.0817f, 4.0f, 12.5f)
                curveTo(4.0f, 15.0894f, 5.2291f, 17.3912f, 7.1398f, 18.855f)
                curveTo(7.2514f, 18.9405f, 7.4172f, 19.0f, 7.6275f, 19.0f)
                lineTo(16.3725f, 19.0f)
                curveTo(16.5828f, 19.0f, 16.7486f, 18.9405f, 16.8602f, 18.855f)
                curveTo(18.7709f, 17.3912f, 20.0f, 15.0894f, 20.0f, 12.5f)
                curveTo(20.0f, 8.0817f, 16.4183f, 4.5f, 12.0f, 4.5f)
                close()
                moveTo(10.0f, 15.1459f)
                curveTo(10.0f, 14.4436f, 10.3968f, 13.8016f, 11.0249f, 13.4876f)
                lineTo(14.6584f, 11.6708f)
                curveTo(15.0881f, 11.4559f, 15.5441f, 11.9119f, 15.3292f, 12.3417f)
                lineTo(13.5125f, 15.9751f)
                curveTo(13.1984f, 16.6032f, 12.5564f, 17.0f, 11.8541f, 17.0f)
                curveTo(10.8301f, 17.0f, 10.0f, 16.1699f, 10.0f, 15.1459f)
                close()
                moveTo(17.6713f, 10.4278f)
                curveTo(17.3921f, 9.5471f, 16.9032f, 8.719f, 16.2071f, 8.0229f)
                curveTo(13.8836f, 5.6994f, 10.1164f, 5.6994f, 7.7929f, 8.0229f)
                curveTo(7.0968f, 8.719f, 6.6079f, 9.5471f, 6.3287f, 10.4278f)
                curveTo(6.1618f, 10.9543f, 6.4533f, 11.5164f, 6.9797f, 11.6833f)
                curveTo(7.5062f, 11.8501f, 8.0683f, 11.5587f, 8.2352f, 11.0322f)
                curveTo(8.4198f, 10.4498f, 8.7429f, 9.9013f, 9.2071f, 9.4371f)
                curveTo(10.7496f, 7.8946f, 13.2504f, 7.8946f, 14.7929f, 9.4371f)
                curveTo(15.2571f, 9.9013f, 15.5802f, 10.4498f, 15.7648f, 11.0322f)
                curveTo(15.9317f, 11.5587f, 16.4938f, 11.8501f, 17.0203f, 11.6833f)
                curveTo(17.5467f, 11.5164f, 17.8382f, 10.9543f, 17.6713f, 10.4278f)
                close()
            }
        }.build().also {
            _limit = it
        }
    }

private var _limit: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun LimitIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Limit,
            contentDescription = null,
    )
}