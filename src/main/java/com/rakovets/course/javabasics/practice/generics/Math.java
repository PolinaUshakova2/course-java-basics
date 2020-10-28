package com.rakovets.course.javabasics.practice.generics;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Math<T> {
    public <T extends Comparable> T getMaxOfParameters(T type1, T type2, T type3) {
        if (type1.compareTo(type2) >= 0) {
            if (type1.compareTo(type3) >= 0) {
                return type1;
            }
        }
        if (type2.compareTo(type1) >= 0) {
            if (type2.compareTo(type3) >= 0) {
                return type2;
            }
        }
        if (type3.compareTo(type1) >= 0) {
            if (type3.compareTo(type2) >= 0) {
                return type3;
            }
        }
        return null;
    }


    public <T extends Comparable> T getMinOfParameters(T type1, T type2, T type3, T type4, T type5) {
        if (type1.compareTo(type2) <= 0) {
            if (type1.compareTo(type3) <= 0) {
                if (type1.compareTo(type4) <= 0) {
                    if (type1.compareTo(type5) <= 0) {
                        return type1;
                    }
                }
            }
        }
        if (type2.compareTo(type1) <= 0) {
            if (type2.compareTo(type3) <= 0) {
                if (type2.compareTo(type4) <= 0) {
                    if (type2.compareTo(type5) <= 0) {
                        return type2;
                    }
                }
            }
        }
        if (type3.compareTo(type1) <= 0) {
            if (type3.compareTo(type2) <= 0) {
                if (type3.compareTo(type4) <= 0) {
                    if (type3.compareTo(type5) <= 0) {
                        return type3;
                    }
                }
            }
        }
        if (type4.compareTo(type1) <= 0) {
            if (type4.compareTo(type2) <= 0) {
                if (type4.compareTo(type3) <= 0) {
                    if (type4.compareTo(type5) <= 0) {
                        return type4;
                    }
                }
            }
        }
        if (type5.compareTo(type1) <= 0) {
            if (type5.compareTo(type2) <= 0) {
                if (type5.compareTo(type3) <= 0) {
                    if (type5.compareTo(type4) <= 0) {
                        return type5;
                    }
                }
            }
        }
        return null;
    }

    public <T extends Number> double getAverageFromArray(T array[]) {
        double average = 0;
        for (T value : array) {
            average += value.doubleValue()/ array.length;
        }
        BigDecimal bd = new BigDecimal(Double.toString(average));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }


    public <T extends Comparable> T getMaxFromArray(T array[]) {
        T max = array[0];
        for (T type : array) {
            if (type.compareTo(max) > 0) {
                max = type;
            }
        }
        return max;
    }

    public <T extends Comparable> T getMinFromArray(T array[]) {
        T min = array[0];
        for (T type : array) {
            if (type.compareTo(min) < 0) {
                min = type;
            }
        }
        return min;
    }

    public T[] getSortArray(T array[]) {
        Arrays.sort(array);
        return array;
    }

    public int getBinarySearch(T array[], T element) {
        return Arrays.binarySearch(array, element);
    }
}

