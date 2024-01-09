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

val BezierIcon.CallFilled: ImageVector
    get() {
        return _callFilled ?: ImageVector.Builder(
                name = "CallFilled",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(4.7f, 4.4549f)
                curveTo(3.0859f, 6.069f, 3.0859f, 10.5883f, 8.2509f, 15.7532f)
                curveTo(13.4158f, 20.9182f, 17.9352f, 20.9182f, 19.5492f, 19.3042f)
                curveTo(20.5176f, 18.3357f, 20.7804f, 16.9199f, 20.1948f, 16.0761f)
                curveTo(19.6783f, 15.3013f, 18.2207f, 14.1392f, 16.9667f, 14.1392f)
                curveTo(15.6755f, 14.1392f, 14.6931f, 15.7658f, 14.0615f, 15.7532f)
                curveTo(13.4298f, 15.7407f, 11.7864f, 15.0461f, 10.3722f, 13.6319f)
                curveTo(8.958f, 12.2177f, 8.2634f, 10.5743f, 8.2509f, 9.9427f)
                curveTo(8.2384f, 9.311f, 9.8649f, 8.3286f, 9.8649f, 7.0374f)
                curveTo(9.8649f, 5.7835f, 8.7028f, 4.3258f, 7.9281f, 3.8093f)
                curveTo(7.0842f, 3.2237f, 5.6684f, 3.4865f, 4.7f, 4.4549f)
                close()
            }
        }.build().also {
            _callFilled = it
        }
    }

private var _callFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CallFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.CallFilled,
            contentDescription = null,
    )
}