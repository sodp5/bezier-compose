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

val BezierIcons.PersonRemove: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _personRemove ?: ImageVector.Builder(
                    name = "PersonRemove",
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
                    moveTo(10.99f, 10.2f)
                    arcTo(1.6f, 1.6f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 10.99f, 6.999999999999999f)
                    arcTo(1.6f, 1.6f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 10.99f, 10.2f)
                    moveTo(14.59f, 8.6f)
                    arcTo(3.6f, 3.6f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 7.39f, 8.6f)
                    arcTo(3.6f, 3.6f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 14.59f, 8.6f)
                    moveTo(4.998f, 20.688f)
                    lineTo(4.998f, 20.685f)
                    close()
                    moveTo(5.331f, 19.0f)
                    arcTo(6.003f, 6.003f, 199.49075868334816f, isMoreThanHalf = false, isPositiveArc = true, 16.649f, 19.0f)
                    close()
                    moveTo(18.979f, 20.582f)
                    arcTo(8.0f, 8.0f, 356.9950395887191f, isMoreThanHalf = false, isPositiveArc = false, 3.0009999999999994f, 20.582f)
                    arcTo(0.405f, 0.405f, 181.8394473619718f, isMoreThanHalf = false, isPositiveArc = false, 3.4059999999999997f, 21.0f)
                    lineTo(18.573999999999998f, 21.0f)
                    arcTo(0.405f, 0.405f, 90.02952465406403f, isMoreThanHalf = false, isPositiveArc = false, 18.979f, 20.582f)
                    moveTo(20.907f, 9.727f)
                    arcTo(0.933f, 0.933f, 135.0f, isMoreThanHalf = false, isPositiveArc = false, 22.227f, 8.407f)
                    lineTo(20.32f, 6.5f)
                    lineTo(22.227f, 4.593f)
                    arcTo(0.933f, 0.933f, 45.0f, isMoreThanHalf = true, isPositiveArc = false, 20.907f, 3.2729999999999997f)
                    lineTo(19.0f, 5.18f)
                    lineTo(17.093f, 3.2729999999999997f)
                    arcTo(0.933f, 0.933f, 315.0f, isMoreThanHalf = true, isPositiveArc = false, 15.773f, 4.593f)
                    lineTo(17.68f, 6.5f)
                    lineTo(15.773f, 8.407f)
                    arcTo(0.933f, 0.933f, 225.0f, isMoreThanHalf = true, isPositiveArc = false, 17.093f, 9.727f)
                    lineTo(19.0f, 7.82f)
                    close()
                }
            }.build().also {
                _personRemove = it
            }
    }


private var _personRemove: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun PersonRemoveIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.PersonRemove.imageVector,
            contentDescription = null,
    )
}