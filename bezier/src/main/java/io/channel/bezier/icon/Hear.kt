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

val BezierIcon.Hear: ImageVector
    get() {
        return io.channel.bezier.icon._hear ?: ImageVector.Builder(
                name = "Hear",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(16.7824f, 8.463f)
                curveTo(16.4484f, 6.147f, 15.0794f, 4.176f, 13.0254f, 3.056f)
                curveTo(10.5344f, 1.697f, 7.4434f, 1.901f, 5.1544f, 3.581f)
                lineTo(3.4094f, 4.86f)
                lineTo(4.5924f, 6.474f)
                lineTo(6.3364f, 5.194f)
                curveTo(8.0034f, 3.972f, 10.2534f, 3.822f, 12.0674f, 4.812f)
                curveTo(13.5624f, 5.627f, 14.5594f, 7.063f, 14.8034f, 8.748f)
                curveTo(15.0454f, 10.435f, 14.4934f, 12.093f, 13.2894f, 13.298f)
                curveTo(12.4584f, 14.128f, 12.0014f, 15.233f, 12.0014f, 16.407f)
                lineTo(12.0014f, 17.0f)
                curveTo(12.0014f, 17.94f, 11.5524f, 18.836f, 10.8014f, 19.401f)
                curveTo(9.7414f, 20.195f, 8.2614f, 20.195f, 7.2014f, 19.401f)
                curveTo(6.4494f, 18.836f, 6.0014f, 17.94f, 6.0014f, 17.0f)
                lineTo(6.0014f, 16.0f)
                lineTo(4.0014f, 16.0f)
                lineTo(4.0014f, 17.0f)
                curveTo(4.0014f, 18.566f, 4.7484f, 20.061f, 6.0014f, 21.0f)
                curveTo(6.8844f, 21.662f, 7.9424f, 21.993f, 9.0014f, 21.993f)
                curveTo(10.0594f, 21.993f, 11.1184f, 21.662f, 12.0024f, 21.0f)
                curveTo(13.2534f, 20.061f, 14.0014f, 18.565f, 14.0014f, 17.0f)
                lineTo(14.0014f, 16.407f)
                curveTo(14.0014f, 15.767f, 14.2504f, 15.165f, 14.7034f, 14.712f)
                curveTo(16.3584f, 13.057f, 17.1154f, 10.779f, 16.7824f, 8.463f)
                close()
                moveTo(20.7414f, 7.8927f)
                curveTo(20.4834f, 6.1037f, 19.8374f, 4.4577f, 18.8204f, 3.0027f)
                lineTo(17.1804f, 4.1497f)
                curveTo(18.0164f, 5.3457f, 18.5494f, 6.7017f, 18.7624f, 8.1777f)
                curveTo(19.1734f, 11.0387f, 18.2684f, 13.8757f, 16.2774f, 15.9617f)
                lineTo(17.7244f, 17.3427f)
                curveTo(20.1414f, 14.8097f, 21.2414f, 11.3657f, 20.7414f, 7.8927f)
                close()
                moveTo(10.4181f, 8.3128f)
                curveTo(10.0411f, 8.0218f, 9.5681f, 7.9288f, 9.0851f, 8.0538f)
                curveTo(8.5961f, 8.1808f, 8.1821f, 8.5948f, 8.0551f, 9.0838f)
                curveTo(7.9301f, 9.5678f, 8.0231f, 10.0408f, 8.3141f, 10.4168f)
                curveTo(8.6011f, 10.7868f, 9.0341f, 10.9998f, 9.5011f, 10.9998f)
                lineTo(9.5011f, 12.9998f)
                curveTo(8.4101f, 12.9998f, 7.4011f, 12.5048f, 6.7331f, 11.6418f)
                curveTo(6.0641f, 10.7788f, 5.8401f, 9.6638f, 6.1191f, 8.5838f)
                curveTo(6.4271f, 7.3938f, 7.3951f, 6.4258f, 8.5851f, 6.1178f)
                curveTo(9.6641f, 5.8358f, 10.7791f, 6.0618f, 11.6431f, 6.7318f)
                curveTo(12.5061f, 7.4008f, 13.0011f, 8.4088f, 13.0011f, 9.4998f)
                lineTo(11.0011f, 9.4998f)
                curveTo(11.0011f, 9.0328f, 10.7891f, 8.5998f, 10.4181f, 8.3128f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._hear = it
        }
    }

private var _hear: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HearIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Hear,
            contentDescription = null,
    )
}
