/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2013 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.remote.order;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class DisplayPayment implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * Formatted display string for the tender e.g. credit card, cash, etc.
   */
  public java.lang.String getLabel() {
    return genClient.cacheGet(CacheKey.label);
  }

  /**
   * Formatted total amount paid
   */
  public java.lang.String getAmount() {
    return genClient.cacheGet(CacheKey.amount);
  }

  /**
   * Formatted amount paid in tips
   */
  public java.lang.String getTipAmount() {
    return genClient.cacheGet(CacheKey.tipAmount);
  }

  /**
   * Formatted amount paid in tax
   */
  public java.lang.Long getTaxAmount() {
    return genClient.cacheGet(CacheKey.taxAmount);
  }



  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<DisplayPayment> {
    id {
      @Override
      public Object extractValue(DisplayPayment instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    label {
      @Override
      public Object extractValue(DisplayPayment instance) {
        return instance.genClient.extractOther("label", java.lang.String.class);
      }
    },
    amount {
      @Override
      public Object extractValue(DisplayPayment instance) {
        return instance.genClient.extractOther("amount", java.lang.String.class);
      }
    },
    tipAmount {
      @Override
      public Object extractValue(DisplayPayment instance) {
        return instance.genClient.extractOther("tipAmount", java.lang.String.class);
      }
    },
    taxAmount {
      @Override
      public Object extractValue(DisplayPayment instance) {
        return instance.genClient.extractOther("taxAmount", java.lang.Long.class);
      }
    },
    ;
  }

  private GenericClient<DisplayPayment> genClient = new GenericClient<DisplayPayment>(this);

  /**
   * Constructs a new empty instance.
   */
  public DisplayPayment() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public DisplayPayment(String json) throws IllegalArgumentException {
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public DisplayPayment(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public DisplayPayment(DisplayPayment src) {
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }


  @Override
  public void validate() {
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'label' field is set and is not null */
  public boolean isNotNullLabel() {
    return genClient.cacheValueIsNotNull(CacheKey.label);
  }

  /** Checks whether the 'amount' field is set and is not null */
  public boolean isNotNullAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.amount);
  }

  /** Checks whether the 'tipAmount' field is set and is not null */
  public boolean isNotNullTipAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.tipAmount);
  }

  /** Checks whether the 'taxAmount' field is set and is not null */
  public boolean isNotNullTaxAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.taxAmount);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'label' field has been set, however the value could be null */
  public boolean hasLabel() {
    return genClient.cacheHasKey(CacheKey.label);
  }

  /** Checks whether the 'amount' field has been set, however the value could be null */
  public boolean hasAmount() {
    return genClient.cacheHasKey(CacheKey.amount);
  }

  /** Checks whether the 'tipAmount' field has been set, however the value could be null */
  public boolean hasTipAmount() {
    return genClient.cacheHasKey(CacheKey.tipAmount);
  }

  /** Checks whether the 'taxAmount' field has been set, however the value could be null */
  public boolean hasTaxAmount() {
    return genClient.cacheHasKey(CacheKey.taxAmount);
  }


  /**
   * Sets the field 'id'.
   */
  public DisplayPayment setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'label'.
   */
  public DisplayPayment setLabel(java.lang.String label) {
    return genClient.setOther(label, CacheKey.label);
  }

  /**
   * Sets the field 'amount'.
   */
  public DisplayPayment setAmount(java.lang.String amount) {
    return genClient.setOther(amount, CacheKey.amount);
  }

  /**
   * Sets the field 'tipAmount'.
   */
  public DisplayPayment setTipAmount(java.lang.String tipAmount) {
    return genClient.setOther(tipAmount, CacheKey.tipAmount);
  }

  /**
   * Sets the field 'taxAmount'.
   */
  public DisplayPayment setTaxAmount(java.lang.Long taxAmount) {
    return genClient.setOther(taxAmount, CacheKey.taxAmount);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'label' field, the 'has' method for this field will now return false */
  public void clearLabel() {
    genClient.clear(CacheKey.label);
  }
  /** Clears the 'amount' field, the 'has' method for this field will now return false */
  public void clearAmount() {
    genClient.clear(CacheKey.amount);
  }
  /** Clears the 'tipAmount' field, the 'has' method for this field will now return false */
  public void clearTipAmount() {
    genClient.clear(CacheKey.tipAmount);
  }
  /** Clears the 'taxAmount' field, the 'has' method for this field will now return false */
  public void clearTaxAmount() {
    genClient.clear(CacheKey.taxAmount);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public DisplayPayment copyChanges() {
    DisplayPayment copy = new DisplayPayment();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(DisplayPayment src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new DisplayPayment(src).getJSONObject(), src.genClient);
    }
  }

  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    return genClient.getBundle();
  }

  @Override
  public String toString() {
    return genClient.toString();
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
    genClient.writeToParcel(dest, flags);
  }

  public static final android.os.Parcelable.Creator<DisplayPayment> CREATOR = new android.os.Parcelable.Creator<DisplayPayment>() {
    @Override
    public DisplayPayment createFromParcel(android.os.Parcel in) {
      DisplayPayment instance = new DisplayPayment(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public DisplayPayment[] newArray(int size) {
      return new DisplayPayment[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<DisplayPayment> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<DisplayPayment>() {
    @Override
    public DisplayPayment create(org.json.JSONObject jsonObject) {
      return new DisplayPayment(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;

    public static final boolean LABEL_IS_REQUIRED = false;

    public static final boolean AMOUNT_IS_REQUIRED = false;

    public static final boolean TIPAMOUNT_IS_REQUIRED = false;

    public static final boolean TAXAMOUNT_IS_REQUIRED = false;

  }

}
