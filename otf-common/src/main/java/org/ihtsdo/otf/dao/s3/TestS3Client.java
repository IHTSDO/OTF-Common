package org.ihtsdo.otf.dao.s3;

import java.io.IOException;

public interface TestS3Client {

	void freshBucketStore() throws IOException;

	void createBucket(String bucketName);

}
