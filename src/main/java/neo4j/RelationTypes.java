package neo4j;

import org.neo4j.graphdb.RelationshipType;

/**
 * Created by Geoffrey Hecht on 05/06/14.
 */
public enum RelationTypes implements RelationshipType {
    APP_OWNS_CLASS,
    CLASS_OWNS_METHOD,
    CLASS_OWNS_VARIABLE,
    METHOD_OWNS_ARGUMENT,
    IMPLEMENTS,
    EXTENDS,
    CALLS,
    USES,
    APP_OWNS_GLOBAL_VARIABLE,
    APP_OWNS_FUNCTION,
    METHOD_SENDS_MESSAGE,
    MESSAGE_TARGETS_METHOD,
    METHOD_OWNS_STATEMENT,
    STATEMENT_OWNS_STATEMENT,
    STATEMENT_OWNS_VARIABLE,
    ENTITY_RECEIVES_MESSAGE,
    CLASS_EXTENDS_EXTERNAL_CLASS,
    OBSERVES,
    EXTENSION_OF,
    CLASS_NESTS_CLASS,
    METHOD_NESTS_CLASS,
    METHOD_NESTS_METHOD

}
