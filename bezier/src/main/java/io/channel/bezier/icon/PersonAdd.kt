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

val BezierIcons.PersonAdd: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _personAdd ?: ImageVector.Builder(
                    name = "PersonAdd",
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
                    moveTo(17.998f, 4.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 19.998f, 4.0f)
                    lineTo(19.998f, 6.0f)
                    lineTo(21.998f, 6.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 21.998f, 8.0f)
                    lineTo(19.998f, 8.0f)
                    lineTo(19.998f, 10.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 17.998f, 10.0f)
                    lineTo(17.998f, 8.0f)
                    lineTo(15.998000000000001f, 8.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = true, 15.998000000000001f, 6.0f)
                    lineTo(17.998f, 6.0f)
                    close()
                    moveTo(12.58f, 8.6f)
                    arcTo(1.6f, 1.6f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 9.379999999999999f, 8.6f)
                    arcTo(1.6f, 1.6f, 180.00000170754728f, isMoreThanHalf = false, isPositiveArc = true, 12.579999999999998f, 8.6f)
                    moveTo(10.979999999999999f, 12.2f)
                    arcTo(3.6f, 3.6f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 10.979999999999999f, 4.999999999999999f)
                    arcTo(3.6f, 3.6f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 10.979999999999999f, 12.2f)
                    moveTo(10.983999999999998f, 15.0f)
                    arcTo(6.0f, 6.0f, 269.97951088680276f, isMoreThanHalf = false, isPositiveArc = true, 16.642999999999997f, 19.0f)
                    lineTo(5.325f, 19.0f)
                    curveTo(6.149f, 16.67f, 8.372f, 15.0f, 10.984f, 15.0f)
                    moveTo(18.461f, 21.0f)
                    curveTo(18.746f, 21.0f, 18.985f, 20.76f, 18.967f, 20.476f)
                    arcTo(8.0f, 8.0f, 356.2641104008532f, isMoreThanHalf = false, isPositiveArc = false, 3.0009999999999994f, 20.476f)
                    arcTo(0.504f, 0.504f, 182.27488780252696f, isMoreThanHalf = false, isPositiveArc = false, 3.5069999999999997f, 21.0f)
                    close()
                }
            }.build().also {
                _personAdd = it
            }
    }


private var _personAdd: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun PersonAddIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.PersonAdd.imageVector,
            contentDescription = null,
    )
}
