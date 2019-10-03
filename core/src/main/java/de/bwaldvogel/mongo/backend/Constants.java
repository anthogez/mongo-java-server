package de.bwaldvogel.mongo.backend;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public interface Constants {

    String ID_FIELD = "_id";

    int MAX_NS_LENGTH = 128;

    Set<String> REFERENCE_KEYS = new LinkedHashSet<>(Arrays.asList("$ref", "$id"));

}
