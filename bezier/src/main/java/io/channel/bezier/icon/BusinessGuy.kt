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

val BezierIcons.BusinessGuy: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _businessGuy ?: ImageVector.Builder(
                    name = "BusinessGuy",
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
                    moveTo(7.5f, 6.5f)
                    arcTo(4.5f, 4.5f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 16.5f, 6.5f)
                    arcTo(4.5f, 4.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 6.5f)
                    moveTo(14.5f, 6.5f)
                    curveTo(14.5f, 5.122f, 13.378f, 4.0f, 12.0f, 4.0f)
                    arcTo(2.503f, 2.503f, 269.93136856010074f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 6.5f)
                    curveTo(9.5f, 7.878f, 10.621f, 9.0f, 12.0f, 9.0f)
                    curveTo(13.378f, 9.0f, 14.5f, 7.878f, 14.5f, 6.5f)
                    moveTo(2.062f, 20.876f)
                    curveTo(2.622f, 15.882f, 6.857f, 12.0f, 12.0f, 12.0f)
                    curveTo(17.143f, 12.0f, 21.380000000000003f, 15.882f, 21.938000000000002f, 20.875999999999998f)
                    arcTo(1.007f, 1.007f, 353.3268380257319f, isMoreThanHalf = false, isPositiveArc = true, 20.944f, 22.0f)
                    lineTo(3.056f, 22.0f)
                    curveTo(2.456f, 22.0f, 1.996f, 21.473f, 2.0620000000000003f, 20.876f)
                    moveTo(16.429000000000002f, 15.332f)
                    arcTo(8.0f, 8.0f, 303.5608496324778f, isMoreThanHalf = false, isPositiveArc = false, 13.664000000000001f, 14.172f)
                    lineTo(13.276000000000002f, 14.947000000000001f)
                    arcTo(1.0f, 1.0f, 26.551360225636152f, isMoreThanHalf = false, isPositiveArc = true, 12.382000000000001f, 15.500000000000002f)
                    lineTo(11.618000000000002f, 15.500000000000002f)
                    arcTo(1.0f, 1.0f, 90.0305975593058f, isMoreThanHalf = false, isPositiveArc = true, 10.724000000000002f, 14.947000000000001f)
                    lineTo(10.336000000000002f, 14.173000000000002f)
                    arcTo(8.0f, 8.0f, 258.04184378580624f, isMoreThanHalf = false, isPositiveArc = false, 7.5710000000000015f, 15.333000000000002f)
                    lineTo(9.571000000000002f, 20.0f)
                    lineTo(10.200000000000001f, 20.0f)
                    lineTo(10.840000000000002f, 16.804f)
                    arcTo(1.0f, 1.0f, 191.30313606934305f, isMoreThanHalf = false, isPositiveArc = true, 11.820000000000002f, 15.999999999999998f)
                    lineTo(12.180000000000001f, 15.999999999999998f)
                    arcTo(1.0f, 1.0f, 270.0346027578083f, isMoreThanHalf = false, isPositiveArc = true, 13.160000000000002f, 16.804f)
                    lineTo(13.8f, 20.0f)
                    lineTo(14.428f, 20.0f)
                    close()
                }
            }.build().also {
                _businessGuy = it
            }
    }


private var _businessGuy: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun BusinessGuyIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.BusinessGuy.imageVector,
            contentDescription = null,
    )
}