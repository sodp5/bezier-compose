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
import io.channel.bezier.BezierIcons

val BezierIcons.ChatCheckFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _chatCheckFilled ?: ImageVector.Builder(
                    name = "ChatCheckFilled",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                ) {
                    moveTo(20.8223f, 16.683f)
                    curveTo(20.5763f, 17.144f, 20.5573f, 17.694f, 20.7233f, 18.19f)
                    lineTo(21.3613f, 20.105f)
                    curveTo(21.6223f, 20.886f, 20.8793f, 21.63f, 20.0973f, 21.37f)
                    curveTo(19.6395f, 21.2172f, 19.1583f, 21.0569f, 18.7279f, 20.9135f)
                    curveTo(18.5302f, 20.8476f, 18.3433f, 20.7853f, 18.1743f, 20.729f)
                    curveTo(17.6813f, 20.565f, 17.1373f, 20.584f, 16.6783f, 20.829f)
                    curveTo(14.7293f, 21.868f, 12.4033f, 22.29f, 9.94729f, 21.796f)
                    curveTo(5.94629f, 20.991f, 2.78229f, 17.703f, 2.12929f, 13.675f)
                    curveTo(1.02329f, 6.848f, 6.83729f, 1.033f, 13.6643f, 2.137f)
                    curveTo(17.6933f, 2.789f, 20.9823f, 5.954f, 21.7873f, 9.954f)
                    curveTo(22.2813f, 12.409f, 21.8613f, 14.734f, 20.8223f, 16.683f)
                    close()
                    moveTo(8.08406f, 11.6708f)
                    lineTo(10.4035f, 13.898f)
                    lineTo(15.852f, 8.77854f)
                    curveTo(16.2544f, 8.40048f, 16.887f, 8.42018f, 17.2651f, 8.82254f)
                    curveTo(17.6431f, 9.22487f, 17.6234f, 9.85746f, 17.2212f, 10.2355f)
                    lineTo(11.1002f, 15.9881f)
                    curveTo(10.7014f, 16.3629f, 10.0788f, 16.3596f, 9.68408f, 15.9805f)
                    lineTo(6.69867f, 13.1135f)
                    curveTo(6.30037f, 12.731f, 6.28747f, 12.0981f, 6.66987f, 11.6997f)
                    curveTo(7.05239f, 11.3011f, 7.6856f, 11.2882f, 8.08406f, 11.6708f)
                    close()
                }
            }.build().also {
                _chatCheckFilled = it
            }
    }


private var _chatCheckFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChatCheckFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ChatCheckFilled.imageVector,
            contentDescription = null,
    )
}
