/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License
 * 2.0; you may not use this file except in compliance with the Elastic License
 * 2.0.
 */

package org.elasticsearch.xpack.esql.optimizer;

import org.elasticsearch.xpack.esql.core.expression.Expression;
import org.elasticsearch.xpack.esql.core.expression.predicate.logical.And;

public class PropagateNullable extends org.elasticsearch.xpack.esql.optimizer.rules.PropagateNullable {
    @Override
    public Expression rule(And and) {
        return super.rule(and);
    }
}
