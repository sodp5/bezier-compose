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

val BezierIcon.Heart: ImageVector
    get() {
        return _heart ?: ImageVector.Builder(
                name = "Heart",
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
                moveTo(7.8949f, 5.0029f)
                curveTo(7.3269f, 5.0029f, 6.7679f, 5.1189f, 6.2789f, 5.3398f)
                curveTo(5.8179f, 5.5479f, 5.4589f, 5.7799f, 5.2089f, 6.0289f)
                curveTo(3.6699f, 7.5679f, 3.6079f, 9.9538f, 5.0609f, 11.6999f)
                curveTo(6.9159f, 13.9289f, 10.0779f, 16.8819f, 12.0039f, 18.6239f)
                curveTo(13.9299f, 16.8809f, 17.0939f, 13.9269f, 18.9459f, 11.6999f)
                curveTo(20.3989f, 9.9538f, 20.3369f, 7.5689f, 18.7979f, 6.0299f)
                curveTo(18.5479f, 5.7799f, 18.1879f, 5.5479f, 17.7289f, 5.3398f)
                curveTo(16.1569f, 4.6288f, 13.8599f, 5.0009f, 12.8879f, 6.8389f)
                curveTo(12.8879f, 6.8389f, 12.3829f, 7.7899f, 12.2189f, 8.0958f)
                curveTo(12.1199f, 8.2818f, 11.8839f, 8.2818f, 11.7839f, 8.0958f)
                curveTo(11.5749f, 7.7069f, 11.1199f, 6.8389f, 11.1199f, 6.8389f)
                curveTo(10.4499f, 5.5729f, 9.1509f, 5.0029f, 7.8949f, 5.0029f)
                close()
                moveTo(12.0029f, 20.7989f)
                curveTo(11.6449f, 20.7989f, 11.2879f, 20.6709f, 11.0029f, 20.4149f)
                curveTo(9.0889f, 18.6939f, 5.5709f, 15.4409f, 3.5239f, 12.9799f)
                curveTo(1.3939f, 10.4199f, 1.5079f, 6.9019f, 3.7949f, 4.6149f)
                curveTo(4.2159f, 4.1939f, 4.7739f, 3.8249f, 5.4549f, 3.5179f)
                curveTo(7.7179f, 2.4939f, 10.3799f, 3.0419f, 12.0039f, 4.6969f)
                curveTo(13.6279f, 3.0429f, 16.2899f, 2.4959f, 18.5529f, 3.5179f)
                curveTo(19.2329f, 3.8249f, 19.7909f, 4.1939f, 20.2119f, 4.6149f)
                curveTo(22.4989f, 6.9019f, 22.6129f, 10.4199f, 20.4829f, 12.9799f)
                curveTo(18.4379f, 15.4379f, 14.9199f, 18.6929f, 13.0039f, 20.4149f)
                curveTo(12.7189f, 20.6709f, 12.3609f, 20.7989f, 12.0029f, 20.7989f)
                close()
            }
        }.build().also {
            _heart = it
        }
    }

private var _heart: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HeartIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Heart,
            contentDescription = null,
    )
}