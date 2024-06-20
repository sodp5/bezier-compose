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

val BezierIcons.PlusSmall: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _plusSmall ?: ImageVector.Builder(
                    name = "PlusSmall",
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
                    moveTo(12.0f, 5.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 11.0f, 6.0f)
                    lineTo(11.0f, 11.0f)
                    lineTo(6.0f, 11.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = false, 6.0f, 13.0f)
                    lineTo(11.0f, 13.0f)
                    lineTo(11.0f, 18.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = false, 13.0f, 18.0f)
                    lineTo(13.0f, 13.0f)
                    lineTo(18.0f, 13.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 18.0f, 11.0f)
                    lineTo(13.0f, 11.0f)
                    lineTo(13.0f, 6.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 5.0f)
                }
            }.build().also {
                _plusSmall = it
            }
    }


private var _plusSmall: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun PlusSmallIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.PlusSmall.imageVector,
            contentDescription = null,
    )
}