/*
 * Copyright (C) 2009 Inderjeet Singh
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.code.java2objc.code;

import japa.parser.ast.stmt.ThrowStmt;

import com.googlecode.java2objc.objc.CompilationContext;
import com.googlecode.java2objc.objc.SourceCodeWriter;

/**
 * Objective C throw statement
 * 
 * @author David Gileadi
 */
public final class ObjcStatementThrow
    extends ObjcStatement {

  private final ObjcExpression expr;

  public ObjcStatementThrow(CompilationContext context, ThrowStmt stmt) {
    this.expr = context.getExpressionConverter().to(stmt.getExpr());
  }

  @Override
  public void append(SourceCodeWriter writer) {
    writer.append("@throw ").append(expr).endStatement();
  }
}
