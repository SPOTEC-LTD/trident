package org.tron.trident.abi.datatypes.generated;

import java.math.BigInteger;
import org.tron.trident.abi.datatypes.Uint;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.tron.trident.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Uint112 extends Uint {

  public static final Uint112 DEFAULT = new Uint112(BigInteger.ZERO);

  public Uint112(BigInteger value) {
    super(112, value);
  }

  public Uint112(long value) {
    this(BigInteger.valueOf(value));
  }
}
