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

val BezierIcons.Search: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _search ?: ImageVector.Builder(
                    name = "Search",
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
                    moveTo(18.0f, 10.0f)
                    arcTo(8.0f, 8.0f, 359.99363337728624f, isMoreThanHalf = true, isPositiveArc = false, 14.906f, 16.32f)
                    lineTo(20.293f, 21.707f)
                    arcTo(1.0f, 1.0f, 134.00425538642457f, isMoreThanHalf = false, isPositiveArc = false, 21.707f, 20.293f)
                    lineTo(16.32f, 14.905999999999999f)
                    arcTo(7.97f, 7.97f, 37.88839316411509f, isMoreThanHalf = false, isPositiveArc = false, 18.0f, 10.0f)
                    moveTo(16.0f, 10.0f)
                    arcTo(6.0f, 6.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 4.0f, 10.0f)
                    arcTo(6.0f, 6.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 16.0f, 10.0f)
                }
            }.build().also {
                _search = it
            }
    }


private var _search: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SearchIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Search.imageVector,
            contentDescription = null,
    )
}