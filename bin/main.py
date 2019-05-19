import dlib
import sys, os
import numpy as np
from skimage import io

predictor_path = os.getcwd() + "src/dat/shape_predictor_68_face_landmarks.dat"
detector = dlib.get_frontal_face_detector()
predictor = dlib.shape_predictor(predictor_path)

def main():
	argv = sys.argv
	print(argv)
	img = io.imread(argv[1])
	dets = detector(img, 1)
	for d in dets:
		parts = predictor(img, d).parts()
		if len(parts) > 0:
			landmarks = np.array([[p.x, p.y] for p in predictor(img, dets[0]).parts()])
			print(landmarks)
	print("no face")
    
if __name__ == '__main__':
	main()