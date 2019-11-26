package com.dragon.util;
import org.apache.commons.lang.ArrayUtils;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class StreamUtil {
    private StreamUtil(){}

    /**
     * 获取集合流，如果为空，返回空流
     * @param collection
     * @param <T>
     * @return
     */
    public static <T> Stream<T> streamOf(Collection<T> collection){
        return CollectionUtils.isEmpty(collection) ? Stream.empty() :collection.stream();
    }

    /**
     * 获取集合流
     * @param array
     * @param <T>
     * @return
     */
    public static <T> Stream<T> streamOf(T[] array){
        return ArrayUtils.isEmpty(array) ? Stream.empty() : Arrays.asList(array).stream();
    }
}
