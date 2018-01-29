// This class was generated on Mon, 29 Jan 2018 12:12:03 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// CartInformation.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/+ya34/bNhLH3++vGBg4XAL4R3J3aJF9W2RbYFs0WbRBgSIN7DE5tqahSIUc7Voo+r8XlCXbsqQkbTf7snxamDMSZ0Zffjgr8ffJm6qgycXkJXqBa7txPkdhZyfTyc/oGdeGXmEePSbTyfdUHX9cUVCei9r5YvImI1DxHny8x3wynVx6j9V+jmfTyY+E+rU11eRigyZQHPhQsid9GLjxriAvTGFy8fYQ3bVQDlckyCb0I2OhfKkP1mOUZ4ZuxJcWMAYHbgPRERrHs6i/+vtR/+AsVf1wUf9WBsnJyhJzV1rpxDxkHSh16T1ZVQFaDXs/2DgPCBu2aBWjgVs0Jc08GRTSsGEyeg7fOg+0w7wwNIU1GrSKwHkosIpzgi7p/h5bEM92269AG/1SOU2d7M8t/czfSuaJZipDj0rIw/VPr2f//+/zr481ide+e7LQToUFW6Gtr+W40OxJycJTkEXrPIvOYfEUJEMB1mSFN0wB5KTKf6ki4suzgtjSmD+mn6xK/bw61WhH+lWoLVO4y1hlkPM2E1jTxa/ls2f/U6Wp/9L+l+H9r0sLdS3I10JpUouZGn5PsPru5pfVvgjoCawTkKpghcZUsImlZmfRzPc3XbR3PZsDNCnO0RyuGJ7rzaurk7lCudZ8y5p0jNCBZK4MaLVkYXi6RZthFHN8Tr4pPtgyX5OPK7oNpDCoKDRro6OQKQQiePvydCzALOoJop7ePclEinCxWNzd3c05uLnz2wUHV6tt1hXQPJPcPL0Pnbw7UcoIQNYYWC1DxkXBdjsEkTGPBJIEkgSSxweSlxmp964UeF0MN3eqcVi62qHbRg0Yx1up1hka5zl8gyprfkGGARAs5lQDp1bf/TVco5joJrCM838sw9ZhAJfd7OpM2tXDMbUDTjgIq1gQtHV7OYVQqgwwwEo54/wqwnIltJPS0+qfovIzyXCeZ58UYx6fLsX+WXb3BRnwa9NvYQOrtSlpXw5PehWraWj40rZcJxeH3DnJmsu5KAzp+6nmZ2zEmoOKO+bQFty3pc03bb5p801dfCML2onHj3bxYx4JJAkkCSQJJI0stryR5Z3HYoghA8aEj4SPhI+Ej0YWGVptRjqQvi3BI8EjwSPBo/3CakPp48IdoseAMeEj4SPh4/HhY0wpbG8dK1ru0z2jx5mpr53GpSnWHC4toCkytGVOnhXsZ+0tCIQ1m9jWNMXMyasMrdzzS/gxZArlg7TsjCdQJlAmUCZQdqjRWzuno71PsvWhtmgcAGCLvP8E2DqnQ+RBIH/Lih7oU2RzNu8Y88DBvVPjAP33h/YOww8ZeO8L8unoSKjR+pAxDn3KPzOMRHr4dL+3rym0X2BVFjfcAM7Wq7Aoo4wCxeUn7dVsIbicmvOUD5nxhxKtsFT9lE8s/ZyPCGnz0VBalhCHDssDv9AC+VibEKNYFp7VgNg6ttQupHYhtQuPr10Q3PVlIrhr/pHowr87Pn6ES3DXECOAoVsmDesKELbulrytITDA//M+4ssfpD/mM5JmAmMCYwLjIwLj5/wnFfFQkFdkBbfUI0fH1FfP0TyF+izrhnekZ4VjK1MIvLWkDxVs30t1yKFpw5YA4fmL+YsX/66lFdcVeBSqz4fWhtXDtJniBM1y7J3UkDURNRE1ETUR9aiVAqsiYqJ5Yc+6o5sha19D11eHdwh7xzlcFgWhD+BsfOrOww1WN2hmW7Lka4w0ruGeUbl2zhDa4a2DrTJl4Nv+znFq6SZ4bTUrFApwl5Fk5I8vSxpcNtppz3q2w2g8oa6gvnVUhODung63/+tPAAAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.sync;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The cart information.
 */
@Model
public class CartInformation {

    // Required default constructor
    public CartInformation() {}

	/**
	* An array of item details.
	*/
	@SerializedName(value = "item_details", listClass = ItemDetails.class)
	private List<ItemDetails> itemDetails;

	public List<ItemDetails> itemDetails() { return itemDetails; }
	
	public CartInformation itemDetails(List<ItemDetails> itemDetails) {
	    this.itemDetails = itemDetails;
	    return this;
	}

	/**
	* The ID of the invoice. Appears only for PayPal-generated invoices.
	*/
	@SerializedName("paypal_invoice_id")
	private String paypalInvoiceId;

	public String paypalInvoiceId() { return paypalInvoiceId; }
	
	public CartInformation paypalInvoiceId(String paypalInvoiceId) {
	    this.paypalInvoiceId = paypalInvoiceId;
	    return this;
	}

	/**
	* Indicates whether the item amount or the shipping amount already includes tax.
	*/
	@SerializedName("tax_inclusive")
	private Boolean taxInclusive;

	public Boolean taxInclusive() { return taxInclusive; }
	
	public CartInformation taxInclusive(Boolean taxInclusive) {
	    this.taxInclusive = taxInclusive;
	    return this;
	}
}
