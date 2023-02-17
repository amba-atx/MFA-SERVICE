package com.amba.service.mfa.JSONObjects;

public class CollectionRequestJson {
	
	private CollectionInitiatorJson collectionInitiator;
    private CollectionReasonJson collectionReason;
    private Boolean forceCollection;
    private CredentialListJson orgCredentialList;
	public CollectionInitiatorJson getCollectionInitiator() {
		return collectionInitiator;
	}
	public void setCollectionInitiator(CollectionInitiatorJson collectionInitiator) {
		this.collectionInitiator = collectionInitiator;
	}
	public CollectionReasonJson getCollectionReason() {
		return collectionReason;
	}
	public void setCollectionReason(CollectionReasonJson collectionReason) {
		this.collectionReason = collectionReason;
	}
	public Boolean getForceCollection() {
		return forceCollection;
	}
	public void setForceCollection(Boolean forceCollection) {
		this.forceCollection = forceCollection;
	}
	public CredentialListJson getOrgCredentialList() {
		return orgCredentialList;
	}
	public void setOrgCredentialList(CredentialListJson orgCredentialList) {
		this.orgCredentialList = orgCredentialList;
	}

}
