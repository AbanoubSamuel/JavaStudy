package org.study.dsa;

import java.util.Map;

public class EmplyeeUtil {
    static public void setNewEmployee(String newEmployee, String manager, Map<String, String> map) {
        map.put(newEmployee, manager);
    }
}