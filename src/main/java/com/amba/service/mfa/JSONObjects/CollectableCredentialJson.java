package com.amba.service.mfa.JSONObjects;

public class CollectableCredentialJson {
	
	private CollectionReasonJson collectionReason;
    private CollectionTypeJson collectionType;
    private CredentialTypeJson credentialType;
	public CollectionReasonJson getCollectionReason() {
		return collectionReason;
	}
	public void setCollectionReason(CollectionReasonJson collectionReason) {
		this.collectionReason = collectionReason;
	}
	public CollectionTypeJson getCollectionType() {
		return collectionType;
	}
	public void setCollectionType(CollectionTypeJson collectionType) {
		this.collectionType = collectionType;
	}
	public CredentialTypeJson getCredentialType() {
		return credentialType;
	}
	public void setCredentialType(CredentialTypeJson credentialType) {
		this.credentialType = credentialType;
	}

}
