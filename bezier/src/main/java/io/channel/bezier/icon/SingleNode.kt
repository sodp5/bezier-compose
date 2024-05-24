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

val BezierIcon.SingleNode: ImageVector
    get() {
        return _singleNode ?: ImageVector.Builder(
                name = "SingleNode",
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
                moveTo(2.0f, 5.0f)
                curveTo(2.0f, 3.3431f, 3.3431f, 2.0f, 5.0f, 2.0f)
                curveTo(6.3062f, 2.0f, 7.4175f, 2.8348f, 7.8293f, 4.0f)
                lineTo(10.0f, 4.0f)
                curveTo(11.6569f, 4.0f, 13.0f, 5.3432f, 13.0f, 7.0f)
                lineTo(13.0f, 17.0f)
                curveTo(13.0f, 17.5523f, 13.4477f, 18.0f, 14.0f, 18.0f)
                lineTo(16.1707f, 18.0f)
                curveTo(16.5825f, 16.8348f, 17.6938f, 16.0f, 19.0f, 16.0f)
                curveTo(20.6569f, 16.0f, 22.0f, 17.3431f, 22.0f, 19.0f)
                curveTo(22.0f, 20.6569f, 20.6569f, 22.0f, 19.0f, 22.0f)
                curveTo(17.6938f, 22.0f, 16.5825f, 21.1652f, 16.1707f, 20.0f)
                lineTo(14.0f, 20.0f)
                curveTo(12.3431f, 20.0f, 11.0f, 18.6569f, 11.0f, 17.0f)
                lineTo(11.0f, 7.0f)
                curveTo(11.0f, 6.4477f, 10.5523f, 6.0f, 10.0f, 6.0f)
                lineTo(7.8293f, 6.0f)
                curveTo(7.4175f, 7.1652f, 6.3062f, 8.0f, 5.0f, 8.0f)
                curveTo(3.3431f, 8.0f, 2.0f, 6.6568f, 2.0f, 5.0f)
                close()
            }
        }.build().also {
            _singleNode = it
        }
    }

private var _singleNode: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SingleNodeIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.SingleNode,
            contentDescription = null,
    )
}
