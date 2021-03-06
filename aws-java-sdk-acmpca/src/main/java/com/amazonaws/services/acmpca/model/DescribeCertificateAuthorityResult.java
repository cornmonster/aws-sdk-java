/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DescribeCertificateAuthority"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCertificateAuthorityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <a>CertificateAuthority</a> structure that contains information about your private CA.
     * </p>
     */
    private CertificateAuthority certificateAuthority;

    /**
     * <p>
     * A <a>CertificateAuthority</a> structure that contains information about your private CA.
     * </p>
     * 
     * @param certificateAuthority
     *        A <a>CertificateAuthority</a> structure that contains information about your private CA.
     */

    public void setCertificateAuthority(CertificateAuthority certificateAuthority) {
        this.certificateAuthority = certificateAuthority;
    }

    /**
     * <p>
     * A <a>CertificateAuthority</a> structure that contains information about your private CA.
     * </p>
     * 
     * @return A <a>CertificateAuthority</a> structure that contains information about your private CA.
     */

    public CertificateAuthority getCertificateAuthority() {
        return this.certificateAuthority;
    }

    /**
     * <p>
     * A <a>CertificateAuthority</a> structure that contains information about your private CA.
     * </p>
     * 
     * @param certificateAuthority
     *        A <a>CertificateAuthority</a> structure that contains information about your private CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCertificateAuthorityResult withCertificateAuthority(CertificateAuthority certificateAuthority) {
        setCertificateAuthority(certificateAuthority);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCertificateAuthority() != null)
            sb.append("CertificateAuthority: ").append(getCertificateAuthority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCertificateAuthorityResult == false)
            return false;
        DescribeCertificateAuthorityResult other = (DescribeCertificateAuthorityResult) obj;
        if (other.getCertificateAuthority() == null ^ this.getCertificateAuthority() == null)
            return false;
        if (other.getCertificateAuthority() != null && other.getCertificateAuthority().equals(this.getCertificateAuthority()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateAuthority() == null) ? 0 : getCertificateAuthority().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCertificateAuthorityResult clone() {
        try {
            return (DescribeCertificateAuthorityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
