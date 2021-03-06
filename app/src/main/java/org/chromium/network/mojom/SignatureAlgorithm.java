
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/digitally_signed.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;

public final class SignatureAlgorithm {


    public static final int SIG_ALGO_ANONYMOUS = (int) (0L);

    public static final int SIG_ALGO_RSA = (int) (1L);

    public static final int SIG_ALGO_DSA = (int) (2L);

    public static final int SIG_ALGO_ECDSA = (int) (3L);

    public static final int MIN_VALUE = (int) (0);
    public static final int MAX_VALUE = (int) (3);

    private static final boolean IS_EXTENSIBLE = false;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value))
            return;

        throw new DeserializationException("Invalid enum value.");
    }

    private SignatureAlgorithm() {}

}