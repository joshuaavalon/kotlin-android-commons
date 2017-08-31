package io.joshuaavalon.common

import android.database.Cursor


/**
 * Returns the value of the requested column as a String.
 *
 * The result and whether this method throws an exception when the column value is null or
 * the column type is not a string type is implementation-defined.
 *
 * @param columnName The name of the target column.
 * @return The value of that column as a String.
 */
fun Cursor.getString(columnName: String): String = getString(getColumnIndexOrThrow(columnName))

/**
 * Returns the value of the requested column as an int.
 *
 * The result and whether this method throws an exception when the column value is null,
 * the column type is not an integral type, or the integer value is outside the range
 * &#91;Integer.MIN_VALUE, Integer.MAX_VALUE&#93; is implementation-defined.
 *
 * @param columnName The name of the target column.
 * @return The value of that column as an int.
 */
fun Cursor.getInt(columnName: String): Int = getInt(getColumnIndexOrThrow(columnName))

/**
 * Returns the value of the requested column as a float.
 *
 * The result and whether this method throws an exception when the column value is null,
 * the column type is not a floating-point type, or the floating-point value is not representable
 * as a float value is implementation-defined.
 *
 * @param columnName The name of the target column.
 * @return The value of that column as a float.
 */
fun Cursor.getFloat(columnName: String): Float = getFloat(getColumnIndexOrThrow(columnName))

/**
 * Returns the value of the requested column as a long.
 *
 * The result and whether this method throws an exception when the column value is null,
 * the column type is not an integral type, or the integer value is outside the range
 * &#91;Long.MIN_VALUE, Long.MAX_VALUE&#93; is implementation-defined.
 *
 * @param columnName The name of the target column.
 * @return The value of that column as a long.
 */
fun Cursor.getLong(columnName: String): Long = getLong(getColumnIndexOrThrow(columnName))

/**
 * Returns the value of the requested column as a short.
 *
 * The result and whether this method throws an exception when the column value is null,
 * the column type is not an integral type, or the integer value is outside the range
 * &#91;Short.MIN_VALUE, Short.MAX_VALUE&#93; is implementation-defined.
 *
 * @param columnName The name of the target column.
 * @return The value of that column as a short.
 */
fun Cursor.getShort(columnName: String): Short = getShort(getColumnIndexOrThrow(columnName))

/**
 * Returns the value of the requested column as a double.
 *
 * The result and whether this method throws an exception when the column value is null,
 * the column type is not a floating-point type, or the floating-point value is not representable
 * as a double value is implementation-defined.
 *
 * @param columnName The name of the target column.
 * @return The value of that column as a double.
 */
fun Cursor.getDouble(columnName: String): Double = getDouble(getColumnIndexOrThrow(columnName))

/**
 * Returns the value of the requested column as a byte array.
 *
 * The result and whether this method throws an exception when the column value is null or
 * the column type is not a blob type is implementation-defined.
 *
 * @param columnName The name of the target column.
 * @return The value of that column as a byte array.
 */
fun Cursor.getBlob(columnName: String): ByteArray = getBlob(getColumnIndexOrThrow(columnName))