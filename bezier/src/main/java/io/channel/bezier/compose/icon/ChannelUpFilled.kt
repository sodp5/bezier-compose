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

val BezierIcon.ChannelUpFilled: ImageVector
    get() {
        return _channelUpFilled ?: ImageVector.Builder(
                name = "ChannelUpFilled",
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
                moveTo(15.2135f, 10.8077f)
                curveTo(14.3685f, 10.8077f, 14.0145f, 10.1967f, 14.0145f, 8.7027f)
                curveTo(14.0145f, 7.2077f, 14.3685f, 6.5977f, 15.2135f, 6.5977f)
                curveTo(16.0585f, 6.5977f, 16.4115f, 7.2077f, 16.4115f, 8.7027f)
                curveTo(16.4115f, 10.1967f, 16.0585f, 10.8077f, 15.2135f, 10.8077f)
                close()
                moveTo(8.7865f, 10.8077f)
                curveTo(7.9415f, 10.8077f, 7.5885f, 10.1967f, 7.5885f, 8.7027f)
                curveTo(7.5885f, 7.2077f, 7.9415f, 6.5977f, 8.7865f, 6.5977f)
                curveTo(9.6315f, 6.5977f, 9.9845f, 7.2077f, 9.9845f, 8.7027f)
                curveTo(9.9845f, 10.1967f, 9.6315f, 10.8077f, 8.7865f, 10.8077f)
                close()
                moveTo(20.7235f, 18.1877f)
                curveTo(20.5575f, 17.6917f, 20.5765f, 17.1417f, 20.8225f, 16.6807f)
                curveTo(21.8605f, 14.7327f, 22.2815f, 12.4067f, 21.7875f, 9.9527f)
                curveTo(20.9825f, 5.9517f, 17.6925f, 2.7867f, 13.6645f, 2.1357f)
                curveTo(6.8375f, 1.0307f, 1.0235f, 6.8457f, 2.1295f, 13.6727f)
                curveTo(2.7825f, 17.7007f, 5.9465f, 20.9897f, 9.9465f, 21.7937f)
                curveTo(12.4025f, 22.2877f, 14.7295f, 21.8667f, 16.6785f, 20.8267f)
                curveTo(17.1375f, 20.5817f, 17.6805f, 20.5617f, 18.1745f, 20.7267f)
                curveTo(18.7115f, 20.9057f, 19.4285f, 21.1447f, 20.0975f, 21.3677f)
                curveTo(20.8795f, 21.6287f, 21.6225f, 20.8847f, 21.3615f, 20.1027f)
                lineTo(20.7235f, 18.1877f)
                close()
            }
        }.build().also {
            _channelUpFilled = it
        }
    }

private var _channelUpFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChannelUpFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ChannelUpFilled,
            contentDescription = null,
    )
}