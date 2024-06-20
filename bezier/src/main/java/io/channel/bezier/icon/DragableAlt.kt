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

val BezierIcons.DragableAlt: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _dragableAlt ?: ImageVector.Builder(
                    name = "DragableAlt",
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
                    moveTo(17.0f, 8.25f)
                    arcTo(2.25f, 2.25f, 180.0f, isMoreThanHalf = true, isPositiveArc = false, 21.5f, 8.25f)
                    arcTo(2.25f, 2.25f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 17.0f, 8.25f)
                    moveTo(17.0f, 15.75f)
                    arcTo(2.25f, 2.25f, 180.0f, isMoreThanHalf = true, isPositiveArc = false, 21.5f, 15.75f)
                    arcTo(2.25f, 2.25f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 17.0f, 15.75f)
                    moveTo(12.0f, 10.5f)
                    arcTo(2.25f, 2.25f, 90.0f, isMoreThanHalf = true, isPositiveArc = true, 12.0f, 6.0f)
                    arcTo(2.25f, 2.25f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 12.0f, 10.5f)
                    moveTo(9.75f, 15.75f)
                    arcTo(2.25f, 2.25f, 180.0f, isMoreThanHalf = true, isPositiveArc = false, 14.25f, 15.75f)
                    arcTo(2.25f, 2.25f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 9.75f, 15.75f)
                    moveTo(4.75f, 10.5f)
                    arcTo(2.25f, 2.25f, 90.0f, isMoreThanHalf = true, isPositiveArc = true, 4.75f, 6.0f)
                    arcTo(2.25f, 2.25f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 4.75f, 10.5f)
                    moveTo(2.5f, 15.75f)
                    arcTo(2.25f, 2.25f, 180.0f, isMoreThanHalf = true, isPositiveArc = false, 7.0f, 15.75f)
                    arcTo(2.25f, 2.25f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 15.75f)
                }
            }.build().also {
                _dragableAlt = it
            }
    }


private var _dragableAlt: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun DragableAltIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.DragableAlt.imageVector,
            contentDescription = null,
    )
}