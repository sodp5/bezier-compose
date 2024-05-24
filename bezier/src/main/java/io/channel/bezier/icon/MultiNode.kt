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

val BezierIcon.MultiNode: ImageVector
    get() {
        return _multiNode ?: ImageVector.Builder(
                name = "MultiNode",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(12.0f, 2.0f)
                curveTo(10.3431f, 2.0f, 9.0f, 3.3431f, 9.0f, 5.0f)
                curveTo(9.0f, 6.3062f, 9.8348f, 7.4175f, 11.0f, 7.8293f)
                lineTo(11.0f, 11.0f)
                lineTo(6.0f, 11.0f)
                curveTo(4.3432f, 11.0f, 3.0f, 12.3431f, 3.0f, 14.0f)
                lineTo(3.0f, 16.1707f)
                curveTo(1.8348f, 16.5825f, 1.0f, 17.6938f, 1.0f, 19.0f)
                curveTo(1.0f, 20.6569f, 2.3431f, 22.0f, 4.0f, 22.0f)
                curveTo(5.6568f, 22.0f, 7.0f, 20.6569f, 7.0f, 19.0f)
                curveTo(7.0f, 17.6938f, 6.1652f, 16.5825f, 5.0f, 16.1707f)
                lineTo(5.0f, 14.0f)
                curveTo(5.0f, 13.4477f, 5.4477f, 13.0f, 6.0f, 13.0f)
                lineTo(18.0f, 13.0f)
                curveTo(18.5523f, 13.0f, 19.0f, 13.4477f, 19.0f, 14.0f)
                lineTo(19.0f, 16.1707f)
                curveTo(17.8348f, 16.5825f, 17.0f, 17.6938f, 17.0f, 19.0f)
                curveTo(17.0f, 20.6569f, 18.3431f, 22.0f, 20.0f, 22.0f)
                curveTo(21.6569f, 22.0f, 23.0f, 20.6569f, 23.0f, 19.0f)
                curveTo(23.0f, 17.6938f, 22.1652f, 16.5825f, 21.0f, 16.1707f)
                lineTo(21.0f, 14.0f)
                curveTo(21.0f, 12.3431f, 19.6569f, 11.0f, 18.0f, 11.0f)
                lineTo(13.0f, 11.0f)
                lineTo(13.0f, 7.8293f)
                curveTo(14.1652f, 7.4175f, 15.0f, 6.3062f, 15.0f, 5.0f)
                curveTo(15.0f, 3.3431f, 13.6569f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }.build().also {
            _multiNode = it
        }
    }

private var _multiNode: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun MultiNodeIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.MultiNode,
            contentDescription = null,
    )
}
