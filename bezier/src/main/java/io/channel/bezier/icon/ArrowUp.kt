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
import io.channel.bezier.BezierIcons

val BezierIcons.ArrowUp: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _arrowUp ?: ImageVector.Builder(
                    name = "ArrowUp",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(3.285f, 11.837f)
                    arcTo(1.0f, 1.0f, 136.76216668213655f, isMoreThanHalf = false, isPositiveArc = false, 4.698f, 11.881f)
                    lineTo(11.0f, 5.959f)
                    lineTo(11.0f, 20.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = false, 13.0f, 20.0f)
                    lineTo(13.0f, 5.933f)
                    lineTo(19.329f, 11.881f)
                    arcTo(1.0f, 1.0f, 133.21767883821073f, isMoreThanHalf = false, isPositiveArc = false, 20.699f, 10.423f)
                    lineTo(13.04f, 3.227f)
                    arcTo(1.5f, 1.5f, 313.2356071489822f, isMoreThanHalf = false, isPositiveArc = false, 10.985f, 3.227f)
                    lineTo(3.33f, 10.423f)
                    arcTo(1.0f, 1.0f, 226.80139991888007f, isMoreThanHalf = false, isPositiveArc = false, 3.286f, 11.837f)
                }
            }.build().also {
                _arrowUp = it
            }
    }


private var _arrowUp: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ArrowUpIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ArrowUp.imageVector,
            contentDescription = null,
    )
}