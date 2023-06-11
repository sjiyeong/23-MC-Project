package com.example.mc_project
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mc_project.databinding.ActivityMapBinding
/**
import net.daum.mf.map.api.MapPOIItem
import net.daum.mf.map.api.MapPoint
import net.daum.mf.map.api.MapView
**/

class MapPage: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = ActivityMapBinding.inflate(inflater, container, false)
        binding.searchBtn.setOnClickListener {
            // 버튼 클릭 시 AppCompatActivity 페이지로 이동하는 코드 추가
            val intent = Intent(requireActivity(), SearchPlace::class.java)
            requireActivity().startActivity(intent)
        }

        /**
        context ?: return binding.root
        val mapView =  MapView(context)
        binding.mapView.addView(mapView)

        mapView.setZoomLevel(3, true);
        mapView.zoomIn(true);
        mapView.zoomOut(true);
        val customMarker = MapPOIItem()
        customMarker.apply {
            itemName = "Custom Maker"
            mapPoint = MapPoint.mapPointWithGeoCoord(37.5666805, 126.9784147)
            markerType = MapPOIItem.MarkerType.CustomImage
            customImageResourceId = R.drawable.marker
            selectedMarkerType = MapPOIItem.MarkerType.CustomImage
            customSelectedImageResourceId = R.drawable.marker
            isCustomImageAutoscale = false
            setCustomImageAnchor(0.5f, 1.0f)
        }
        mapView.addPOIItem(customMarker)
**/
        return binding.root
    }
}